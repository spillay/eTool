package za.co.egov.cn.beans;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitType;
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
public class PermitTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private PermitType permitType;
	private Log logger = LogFactory.getLog(getClass());
	public PermitType getPermitType(){
		return permitType;
	}
	public void setPermitType(PermitType permitType){
		this.permitType=permitType;
	}
}
