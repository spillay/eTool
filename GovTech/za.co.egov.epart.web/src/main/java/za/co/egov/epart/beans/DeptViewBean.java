package za.co.egov.epart.beans;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
import za.co.egov.epart.Complaint;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;
@ManagedBean
@ViewScoped
public class DeptViewBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Department department;
	private Province province;
	private Complaint complaint;
	private Log logger = LogFactory.getLog(getClass());
	@PostConstruct
	public void init(){
	ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory().autowireBean(this);
	
	}
	public Department getDepartment(){
		return department;
	}
	public void setDepartment(Department department){
		this.department=department;
	}
	public Province getProvince(){
		return province;
	}
	public void setProvince(Province province){
		this.province=province;
	}
	public Complaint getComplaint(){
		return complaint;
	}
	public void setComplaint(Complaint complaint){
		this.complaint=complaint;
	}
}
