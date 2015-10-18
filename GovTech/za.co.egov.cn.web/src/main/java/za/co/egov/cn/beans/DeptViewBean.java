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
import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ManagedBean
@ViewScoped
public class DeptViewBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private PermitStatus permitStatus;
	private String selectedStatus;
	private Permit selectedPermit;
	public Permit getSelectedPermit() {
		return selectedPermit;
	}

	public void setSelectedPermit(Permit selectedPermit) {
		this.selectedPermit = selectedPermit;
		logger.debug("Selected Permit: " + selectedPermit.getId());
		logger.debug("Selected Permit: " + selectedPermit.getClient().getIdno());
		logger.debug("Selected Permit: " + selectedPermit.getClient().getEmail());
	}

	private Map<String, String> permitStatusData;
	private List<Permit> permits = new ArrayList<Permit>();

	
	public String getSelectedStatus() {
		return selectedStatus;
	}

	public void setSelectedStatus(String selectedStatus) {
		this.selectedStatus = selectedStatus;
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
	public void updateAction(ActionEvent actionEvent) {
		logger.debug("update permit: " + this.selectedPermit.getId());
		permitData.updateEntity(selectedPermit);
	}
	public void searchAction(ActionEvent actionEvent) {
		logger.debug("selected status: " + this.selectedStatus);
		PermitStatus p = this.getStatus(selectedStatus);
		logger.debug("selected status id: " + p.getId());
		// TODO: Fix get subset
		//permits = permitData.getByStatus(p.getId().toString());
		permits.clear();
		permits = permitData.getEntities();
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
}
