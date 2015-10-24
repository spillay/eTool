package za.co.egov.cn.beans;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitStatus;
import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.ClientService;
import za.co.egov.cn.service.PermitService;
import za.co.egov.cn.service.PermitStatusService;
import za.co.egov.notifications.SMS;
import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;



@ManagedBean
@ViewScoped
public class DeptViewBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private PermitStatus permitStatus;
	private String selectedStatus;
	private Permit selectedPermit;
	
	private boolean payPanel;
	private boolean approvedPanel;
	
	public boolean isPayPanel() {
		return payPanel;
	}

	public void setPayPanel(boolean payPanel) {
		this.payPanel = payPanel;
	}

	public boolean isApprovedPanel() {
		return approvedPanel;
	}

	public void setApprovedPanel(boolean approvedPanel) {
		this.approvedPanel = approvedPanel;
	}

	public Permit getSelectedPermit() {
		return selectedPermit;
	}

	public void setSelectedPermit(Permit selectedPermit) {
		this.selectedPermit = selectedPermit;
		logger.debug("Selected Permit Table ID: " + selectedPermit.getId());
		logger.debug("Selected Permit ID No: " + selectedPermit.getClient().getIdno());
		logger.debug("Selected Permit Client Email: " + selectedPermit.getClient().getEmail());
		logger.debug("Selected Permit Status: " + selectedPermit.getPermitstatus().getStatus());
		logger.debug("Selected Permit Type: " + selectedPermit.getPermittype().getName());
		
	}

	private Map<String, String> permitStatusData;
	private List<Permit> permits = new ArrayList<Permit>();

	
	public String getSelectedStatus() {
		return selectedStatus;
	}

	public void setSelectedStatus(String selectedStatus) {
		this.selectedStatus = selectedStatus;
		logger.debug("Selected Status ===>");
		switch(selectedStatus){
		case "Paid":
			this.payPanel = true;
			this.approvedPanel = false;
			break;
		case "Approved":
			this.approvedPanel = true;
			this.payPanel = false;
			break;
		}
		RequestContext.getCurrentInstance().update("statusdetailForm");
		RequestContext.getCurrentInstance().update("statusdetailForm:permintNoOutput");
		RequestContext.getCurrentInstance().update("statusdetailForm:permintNoInput");
	}

	public Map<String, String> getPermitStatusData() {
		return permitStatusData;
	}

	public void setPermitStatusData(Map<String, String> permitStatusData) {
		this.permitStatusData = permitStatusData;
	}

	private Permit permit;
	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	PermitService permitData;
	
	@Autowired
	PermitStatusService statusData;

	@PostConstruct
	private void init() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
				.getContext();
		WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory()
				.autowireBean(this);

		Iterator<PermitStatus> it = statusData.getEntities().iterator();
		permitStatusData = new HashMap<String, String>();
		while (it.hasNext()) {
			PermitStatus p = it.next();
			logger.debug("Loading PermitStatus: " + p.getStatus());
			logger.debug("with id: " + p.getId());
			permitStatusData.put(p.getStatus(), p.getStatus());
		}
		this.payPanel = false;
		this.approvedPanel = false;
	}
	
	private PermitStatus getStatus(String name){
		Iterator<PermitStatus> it = statusData.getEntities().iterator();
		while (it.hasNext()) {
			PermitStatus p = it.next();
			if (p.getStatus().compareTo(name)==0){
				return p;
			}
		}
		return null;
	}
	public void updateStatus(ActionEvent actionEvent) {
		logger.debug("update status permit: " + this.selectedPermit.getId());
		selectedPermit.setPermitstatus(getStatus(selectedStatus));
		permitData.updateEntity(selectedPermit);
		SMS not = new SMS();
		if(this.approvedPanel){
			String no = selectedPermit.getClient().getCellno();
			not.sendApprovedMessage(no);
		}
		if(this.payPanel){
			String no = selectedPermit.getClient().getCellno();
			not.sendPaidMessage(no);
		}
		this.approvedPanel = false;
		this.payPanel = false;
	}
	public void updateAction(ActionEvent actionEvent) {
		logger.debug("update permit: " + this.selectedPermit.getId());
		permitData.updateEntity(selectedPermit);
		
	}
	public void searchAction(ActionEvent actionEvent) {
		logger.debug("selected status: " + this.selectedStatus);
		PermitStatus p = this.getStatus(selectedStatus);
		logger.debug("selected status id: " + p.getId());
		// TODO: Fix get subset
		permits.clear();
		permits = permitData.getByStatus(p);
		
		//permits = permitData.getEntities();
		addMessage("Welcome to GovTech 2015!!");
    }
     
    public List<Permit> getPermits() {
		return permits;
	}

	public void setPermits(List<Permit> permits) {
		this.permits = permits;
	}

	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public PermitStatus getPermitStatus() {
		return permitStatus;
	}

	public void setPermitStatus(PermitStatus permitStatus) {
		this.permitStatus = permitStatus;
	}

	public Permit getPermit() {
		return permit;
	}

	public void setPermit(Permit permit) {
		this.permit = permit;
	}
	/*
	public void report(){
		logger.debug("report");
		  Map parameterMap = new HashMap();
		  String id = "123";
	      parameterMap.put("id", id);
	      FacesContext facesContext = FacesContext.getCurrentInstance();

	      HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

	      logger.debug("before stream");
	      InputStream reportStream = facesContext.getExternalContext().getResourceAsStream("/reports/Permit.jrxml");

	      ServletOutputStream servletOutputStream;
	      try {
	    	  logger.debug("Before try");
			servletOutputStream = response.getOutputStream();
		    JasperRunManager.runReportToPdfStream(reportStream, servletOutputStream, parameterMap);
		      
		      servletOutputStream.flush();
		      servletOutputStream.close();
	      } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      } catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      facesContext.responseComplete();
	      response.setContentType("applicaton/pdf");
	      
	      
	}
	*/
}
