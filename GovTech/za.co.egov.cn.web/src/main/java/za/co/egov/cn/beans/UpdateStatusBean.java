package za.co.egov.cn.beans;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Permit;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
@ManagedBean
@ViewScoped
public class UpdateStatusBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Permit permit;
	private Map<String,String> PrefContactData;
	private Log logger = LogFactory.getLog(getClass());
	@PostConstruct
	public void Permit_permitStatus_init(){
	PrefContactData = new HashMap<String,String>();
	PrefContactData.put("Submitted","Submitted");
	PrefContactData.put("Evaluated","Evaluated");
	PrefContactData.put("Accepted","Accepted");
	PrefContactData.put("Rejected","Rejected");
	PrefContactData.put("Approved","Approved");
	
	}
	public Permit getPermit(){
		return permit;
	}
	public void setPermit(Permit permit){
		this.permit=permit;
	}
	public Map<String,String> getPrefContactData(){
		return PrefContactData;
	}
	public void setPrefContactData(Map<String,String> PrefContactData){
		this.PrefContactData=PrefContactData;
	}
}
