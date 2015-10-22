package za.co.egov.cn.beans;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.ClientService;
import za.co.egov.cn.service.PermitService;

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
public class ClientEnquiryBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Client client = new Client();
	private Permit permit = new Permit();
	
	private Log logger = LogFactory.getLog(getClass());
	
	// New
	private List<Permit> permits = new ArrayList<Permit>();
	
	public List<Permit> getPermits() {
		return permits;
	}
	public void setPermits(List<Permit> permits) {
		this.permits = permits;
	}
	// End New
	@Autowired
	ClientService clientData;
	
	
	
	@PostConstruct
    private void init() {
        ServletContext servletContext = (ServletContext) FacesContext
           .getCurrentInstance().getExternalContext().getContext();
        WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext)
           .getAutowireCapableBeanFactory().autowireBean(this);
        
      
    }
	public void searchAction(ActionEvent actionEvent) {
		logger.debug("id number: " + this.getClient().getIdno());
		logger.info("id number: " + this.getClient().getIdno());
		String idno = client.getIdno().replace("-", "");
		client = clientData.getByID(idno);
        Iterator<Permit> pit = client.getPERMIT_CLIENTS().iterator();
        permits.clear();
        while(pit.hasNext()){
        	Permit p = pit.next();
        	permits.add(p);
        	logger.debug("Found the following permits: " + p.getId()); 
        }
		addMessage("Welcome to GovTech 2015!!");
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public Client getClient(){
		return client;
	}
	public void setClient(Client client){
		this.client=client;
	}
	public Permit getPermit(){
		return permit;
	}
	public void setPermit(Permit permit){
		this.permit=permit;
	}
}
