package za.co.egov.epart.beans;



import za.co.egov.epart.Agency;
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Citizen;
import za.co.egov.epart.Province;
import za.co.egov.epart.service.AgencyService;
import za.co.egov.epart.service.CitizenService;
import za.co.egov.epart.service.ComplaintHelpService;
import za.co.egov.epart.service.ComplaintService;
import za.co.egov.epart.service.ComplaintTypeService;
import za.co.egov.epart.service.DepartmentService;
import za.co.egov.epart.service.ProvinceService;
import za.co.egov.epart.Department;
import za.co.egov.epart.Complaint;
import za.co.egov.epart.ComplaintHelp;
import za.co.egov.epart.ComplaintType;

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
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.primefaces.event.SelectEvent;

@ManagedBean
@ViewScoped
public class ComplaintBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Citizen citizen = new Citizen();
	private Province province;
	private Department department;
	private Complaint complaint = new Complaint();
	private List<ComplaintHelp> comphelper;
	private Log logger = LogFactory.getLog(getClass());
	private ComplaintType selectedComplaintType;

	public ComplaintType getSelectedComplaintType() {
		return selectedComplaintType;
	}
	public void setSelectedComplaintType(ComplaintType selectedComplaintType) {
		this.selectedComplaintType = selectedComplaintType;
	}


	@Autowired
	CitizenService citizenService;
	
	@Autowired
	ComplaintHelpService complaintHelp;
	
	@Autowired
	ComplaintService complaintService;
	
	@Autowired
	ComplaintTypeService complaintTypeService;
	
	@Autowired
	DepartmentService departmentService;
	
	private String selectedDepartment;
	private Map<String, String> departmentData;
	public Map<String, String> getDepartmentData() {
		logger.debug("Loading Department Data: " + selectedProvince);
		
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
	
	@Autowired
    AgencyService agencyService;
	
	private String selectedAgency;
	private Map<String, String> agencyData;
	public Map<String, String> getAgencyData() {
		logger.debug("Loading Agency Data: for Dept" + selectedDepartment);
		return agencyData;
	}
	public void setAgencyData(Map<String, String> agencyData) {
		this.agencyData = agencyData;
	}
	
	private Agency getAgency(String name){
		Iterator<Agency> it = agencyService.getEntities().iterator();
		while(it.hasNext()){
			Agency p = it.next();
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
		

	}
	private ComplaintHelp getCH(String name){
		Iterator<ComplaintHelp> it = comphelper.iterator();
		logger.debug("checking complainttypes: query: " + name);
		while(it.hasNext()){
			ComplaintHelp ch = it.next();
			if (ch.getComval().equals(name)){
				return ch;
			}
		}
		return null;
	}
	public List<String> completeArea(String query) {
		logger.debug("checking complainttypes");
		List<String> results = new ArrayList<String>();
		if(selectedAgency ==null ){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Please select an agency first","Please select an agency first");
            FacesContext.getCurrentInstance().addMessage(":mainForm:msg", msg);
		} else {
		
		Iterator<ComplaintHelp> it = comphelper.iterator();
		String nquery = query.toLowerCase();
		logger.debug("checking complainttypes: query: " + nquery);
		while(it.hasNext()){
			ComplaintHelp ch = it.next();
			if (ch.getKey().equals(nquery)){
				results.add(ch.getComval());
			}
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
	public void onProvinceChange() {
		if(selectedProvince !=null && !selectedProvince.equals("")){
				Iterator<Department> it = departmentService.getEntities(getProvince(selectedProvince)).iterator();
				departmentData = new HashMap<String,String>();
				while(it.hasNext()){
					Department p = it.next();
					logger.debug("Loading: " + p.getName());
					logger.debug("with id: " + p.getId());
					departmentData.put(p.getName(),p.getName());
				}
		} else {
        	departmentData = new HashMap<String,String>();
        	agencyData = new HashMap<String,String>();
        	selectedAgency = null;
		}
    }
	public void onDepartmentChange() {
		if(selectedDepartment !=null && !selectedDepartment.equals("")){
				Iterator<Agency> it = agencyService.getEntities(getDepartment(selectedDepartment)).iterator();
				agencyData = new HashMap<String,String>();
				while(it.hasNext()){
					Agency p = it.next();
					logger.debug("Loading: " + p.getName());
					logger.debug("with id: " + p.getId());
					agencyData.put(p.getName(),p.getName());
				}
		} else {
        	agencyData = new HashMap<String,String>();
		}
    }
	public void onAgencyChange(){
		comphelper = this.complaintHelp.getEntities(getAgency(selectedAgency));
	}

	public void handleSelect(SelectEvent actionEvent) {
		logger.debug("select complainttype Application" + actionEvent.getClass());
		logger.debug("complaint change: " + getComplaint().getDescription());
		if(selectedAgency ==null ){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Please select an agency first","Please select an agency first");
            FacesContext.getCurrentInstance().addMessage("mainForm:msg", msg);
		} else {
			String complaint = actionEvent.getObject().toString();
			ComplaintHelp ch = getCH(complaint);
			logger.debug("complaint type: " + ch.getComplainttype().getName());
			selectedComplaintType = ch.getComplainttype();
		}
		
	}

	public void submitAction(ActionEvent actionEvent) {
		logger.debug("submit complaint Application");
		complaint.setCitizen(citizen);
		complaint.setComplainttype(selectedComplaintType);
		complaint.setAgency(getAgency(selectedAgency));
		citizenService.saveEntity(citizen);
		complaintService.saveEntity(complaint);
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
	public String getSelectedAgency() {
		return selectedAgency;
	}
	public void setSelectedAgency(String selectedAgency) {
		this.selectedAgency = selectedAgency;
	}
}
