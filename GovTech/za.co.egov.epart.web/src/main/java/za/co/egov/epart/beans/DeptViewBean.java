package za.co.egov.epart.beans;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
import za.co.egov.epart.service.ComplaintService;
import za.co.egov.epart.service.DepartmentService;
import za.co.egov.epart.service.ProvinceService;
import za.co.egov.epart.Complaint;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
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
	private Department department;
	private Province province;
	private Complaint complaint;
	private List<Complaint> complaints;
	@Autowired
	ComplaintService complaintService;
	
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	private Log logger = LogFactory.getLog(getClass());
	@PostConstruct
	public void init(){
	ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory().autowireBean(this);
	
	}
	@Autowired
	DepartmentService departmentService;
	
	private String selectedDepartment;
	private Map<String, String> departmentData;
	public Map<String, String> getDepartmentData() {
		if ( departmentData == null || departmentData.size() == 0 ){
			// Try to populate first
			Iterator<Department> it = departmentService.getEntities().iterator();
			departmentData = new HashMap<String,String>();
			while(it.hasNext()){
				Department p = it.next();
				logger.debug("Loading: " + p.getName());
				logger.debug("with id: " + p.getId());
				departmentData.put(p.getName(),p.getName());
			}
			
		}
		return departmentData;
	}
	public void setDepartmentData(Map<String, String> departmentData) {
		this.departmentData = departmentData;
	}
	public String getSelectedDepartment() {
		return selectedDepartment;
	}
	public void setSelectedDepartment(String selectedDepartment) {
		this.selectedDepartment = selectedDepartment;
	}
	private Department getDepartment(String dept){
		Iterator<Department> it = departmentService.getEntities().iterator();
		while(it.hasNext()){
			Department p = it.next();
			if (p.getName().compareTo(dept)==0){
				return p;
			}
		}
		return null;
	}
	
	
	@Autowired
    ProvinceService provinceService;
	
	private String selectedProvince;
	private Map<String, String> provinceData;
	public Map<String, String> getProvinceData() {
		if ( provinceData == null || provinceData.size() == 0 ){
			// Try to populate first
			Iterator<Province> it = provinceService.getEntities().iterator();
			provinceData = new HashMap<String,String>();
			while(it.hasNext()){
				Province p = it.next();
				logger.debug("Loading: " + p.getName());
				logger.debug("with id: " + p.getId());
				provinceData.put(p.getName(),p.getName());
			}
			
		}
		return provinceData;
	}
	public void setProvinceData(Map<String, String> provinceData) {
		this.provinceData = provinceData;
	}
	public String getSelectedProvince() {
		return selectedProvince;
	}
	public void setSelectedProvince(String selectedProvince) {
		this.selectedProvince = selectedProvince;
	}
	private Province getProvince(String name){
		Iterator<Province> it = provinceService.getEntities().iterator();
		while(it.hasNext()){
			Province p = it.next();
			if (p.getName().compareTo(name)==0){
				return p;
			}
		}
		return null;
	}
	public void searchAction(ActionEvent actionEvent) {
		logger.debug("search for complaints");
		this.setComplaints(complaintService.getEntitiesby(getProvince(selectedProvince),getDepartment(selectedDepartment)));
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
