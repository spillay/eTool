package za.co.egov.cn.beans;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitHistory;
import za.co.egov.cn.PermitStatus;
import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.ClientService;
import za.co.egov.cn.service.PermitService;
import za.co.egov.cn.service.PermitStatusService;
import za.co.egov.cn.service.PermitTypeService;
import za.co.egov.notifications.SMS;

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
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;


@ManagedBean
@ViewScoped
public class PermitAppBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Client client = new Client();
	private Map<String, String> PrefContactData;
	private Permit permit = new Permit();
	private PermitHistory permitHistory = new PermitHistory();
	private Log logger = LogFactory.getLog(getClass());
	private List<Permit> permits = new ArrayList<Permit>();
	private String comments;
	private boolean submitButtonState;
	private String idnumber;
	private boolean afterload;
	
	
	public boolean isAfterload() {
		return afterload;
	}

	public void setAfterload(boolean afterload) {
		this.afterload = afterload;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public boolean isSubmitButtonState() {
		return submitButtonState;
	}

	public void setSubmitButtonState(boolean submitButtonState) {
		this.submitButtonState = submitButtonState;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Permit> getPermits() {
		return permits;
	}

	public void setPermits(List<Permit> permits) {
		this.permits = permits;
	}

	@Autowired
	ClientService clientData;
	
	@Autowired
	PermitService permitData;
	
	@Autowired
	PermitTypeService permittypeData;
	
	@Autowired
	PermitStatusService permitstatusData;
	
	
	//New
	private String selectedPermittype;
	

	public String getSelectedPermittype() {
		return selectedPermittype;
	}

	public void setSelectedPermittype(String selectedPermittype) {
		this.selectedPermittype = selectedPermittype;
	}

	private Map<String, String> permitTypes;
	public Map<String, String> getPermitTypes() {
		if ( permitTypes.size() == 0 ){
			// Try to populate first
			Iterator<PermitType> it = permittypeData.getEntities().iterator();
			permitTypes = new HashMap<String,String>();
			while(it.hasNext()){
				PermitType p = it.next();
				logger.debug("Loading Permittype: " + p.getName());
				logger.debug("with id: " + p.getId());
				permitTypes.put(p.getName(),p.getName());
			}
			
		}
		return permitTypes;
	}

	private void Permittype_init(){
		Iterator<PermitType> it = permittypeData.getEntities().iterator();
		permitTypes = new HashMap<String,String>();
		while(it.hasNext()){
			PermitType p = it.next();
			logger.debug("Loading Permittype: " + p.getName());
			logger.debug("with id: " + p.getId());
			permitTypes.put(p.getName(),p.getName());
		}
	}
	private PermitType getPermitType(String permitTypeName){
		Iterator<PermitType> it = permittypeData.getEntities().iterator();
		while(it.hasNext()){
			PermitType p = it.next();
			if (p.getName().compareTo(permitTypeName)==0){
				return p;
			}
		}
		return null;
	}
	private PermitStatus getStatus(String status){
		Iterator<PermitStatus> st = permitstatusData.getEntities().iterator();
		while(st.hasNext()){
			PermitStatus s = st.next();
			if(s.getStatus().compareTo(status) == 0){
				return s;
			}
		}
		return null;
	}
	// End New
	
	@PostConstruct
    private void init() {
        ServletContext servletContext = (ServletContext) FacesContext
           .getCurrentInstance().getExternalContext().getContext();
        WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext)
           .getAutowireCapableBeanFactory().autowireBean(this);

        this.submitButtonState = true;
        Client_prefContact_init();
        Permittype_init();
        afterload = true;
    }
	
	public void Client_prefContact_init() {
		PrefContactData = new HashMap<String, String>();
		PrefContactData.put("EMAIL", "EMAIL");
		PrefContactData.put("TEL", "TEL");
		PrefContactData.put("CELL", "CELL");

	}
	public void onEdit(RowEditEvent event) {
		logger.debug("OnEdit");
		this.submitButtonState = false;
    	RequestContext.getCurrentInstance().update("mainForm:submitBtn");
        FacesMessage msg = new FacesMessage("Permit Edited", ((Permit) event.getObject()).getPermitNo());
        ((Permit) event.getObject()).setPermittype(this.getPermitType(selectedPermittype));
        ((Permit) event.getObject()).setComment(getComments());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCancel(RowEditEvent event) {
    	logger.debug("OnCancel");
        FacesMessage msg = new FacesMessage("Permit Request Cancelled", ((Permit) event.getObject()).getPermitNo());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        permits.remove(((Permit) event.getObject()));
    }
     
    public void onEdit(CellEditEvent event) {
    	logger.debug("OnEdit CellEditEvent");
    	
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    public String checkAction(){
    	this.submitButtonState = false;
    	return null;
    }
	public String addAction() {
		this.submitButtonState = false;
		Permit p = new Permit();
		p.setPermitNo("New");
		logger.debug("Selected Permit Type: " + this.selectedPermittype);
		PermitType pt = getPermitType(selectedPermittype);
        p.setPermittype(pt);
		permits.add(p);
        return null;
    }
	public void loadAction(ActionEvent actionEvent) {
		logger.debug("Load Initial Data" + getClient().getIdno());
		if(client.getIdno() == null){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Invalid ID No","Please input a valid id number");
            FacesContext.getCurrentInstance().addMessage("mainForm:messages", msg);
		}
		String idno = client.getIdno();
		idno = idno.replace("-", "");
		client = clientData.getByID(idno);
		if ( client == null ){
			client = new Client();
			client.setIdno(idno);
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "No Profile Exists, Please create one","No Profile Exists, Please create one");
            FacesContext.getCurrentInstance().addMessage("mainForm:messages", msg);
		} else {
			permits.clear();
			afterload = false;
			/*
			Iterator<Permit> it = client.getPERMIT_CLIENTS().iterator();
			while(it.hasNext()){
				Permit o = it.next();
				logger.debug("permit info: " + o.getPermittype().getName());
				logger.debug("permit info: " + o.getComment());
				//permits.add(o);
			}
			*/
		}
	}
	private void reformat(){
		String idno = client.getIdno().replace("-", "");
		client.setIdno(idno);
		
		String cell = client.getCellno();
		cell = cell.replace("(", "");
		cell = cell.replace(")", "");
		cell = cell.replace("-", "");
		cell = cell.replace(" ", "");
		client.setCellno(cell);
		
		String tel = client.getTelphoneno();
		tel = tel.replace("(", "");
		tel = tel.replace(")", "");
		tel = tel.replace("-", "");
		tel = tel.replace(" ", "");
		client.setTelphoneno(tel);
	}
	public String submitAction() {
		logger.debug("submit Permit Application");
		addMessage("Welcome to GovTech 2015!!");
		
		logger.debug(
				client.getIdno() + ":" +
				client.getFirstname1() + ":"
		);
		reformat();
		logger.debug("Selected PermitType: " + this.selectedPermittype);
		//PermitType p = this.getPermitType(selectedPermittype);
		//logger.debug("Selected PermitType: " + p.getName() + " with id " + p.getId());
		client = clientData.saveEntity(client);
		
		
		PermitStatus s = getStatus("Submitted");
		for(Permit pt: permits){
			pt.setPermitstatus(s);
			pt.setClient(client);
			permitData.saveEntity(pt);
		}
		SMS not = new SMS();
		
		not.sendRecvMessage(client.getCellno());
		return "./ClientEnquiry.xhtml?faces-redirect=true";
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Map<String, String> getPrefContactData() {
		return PrefContactData;
	}

	public void setPrefContactData(Map<String, String> PrefContactData) {
		this.PrefContactData = PrefContactData;
	}

	public Permit getPermit() {
		return permit;
	}

	public void setPermit(Permit permit) {
		this.permit = permit;
	}

	public PermitHistory getPermitHistory() {
		return permitHistory;
	}

	public void setPermitHistory(PermitHistory permitHistory) {
		this.permitHistory = permitHistory;
	}
}
