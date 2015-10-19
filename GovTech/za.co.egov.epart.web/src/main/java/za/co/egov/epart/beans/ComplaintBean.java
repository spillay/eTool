package za.co.egov.epart.beans;



/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Citizen;
import za.co.egov.epart.Province;
import za.co.egov.epart.service.ComplaintHelpService;
import za.co.egov.epart.service.DepartmentService;
import za.co.egov.epart.service.ProvinceService;
import za.co.egov.epart.Department;
import za.co.egov.epart.Complaint;
import za.co.egov.epart.ComplaintHelp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ManagedBean
@ViewScoped
public class ComplaintBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Citizen citizen;
	private Province province;
	private Department department;
	private Complaint complaint;
	private List<ComplaintHelp> comphelper;
	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	ComplaintHelpService complaintHelp;
	
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

	@PostConstruct
	public void init() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
				.getContext();
		WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory()
				.autowireBean(this);
		
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
		comphelper = this.complaintHelp.getEntities();

	}
	public List<String> completeArea(String query) {
		List<String> results = new ArrayList<String>();
		Iterator<ComplaintHelp> it = comphelper.iterator();
		String nquery = query.toLowerCase();
		while(it.hasNext()){
			ComplaintHelp ch = it.next();
			if (ch.getKey().equals(nquery)){
				results.add(ch.getComval());
			}
		}
		 /*
        if(query.equals("When")) {
            results.add("When will my documents be ready");
            results.add("When can I come collect my id, my reference number is:");
            results.add("PrimeFaces is lightweight.");
            results.add("PrimeFaces is easy to use.");
            results.add("PrimeFaces is developed with passion!");
        }
       
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         */
        
        return results;
    }

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}
}
