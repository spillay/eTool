package za.co.egov.epart.beans;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
import za.co.egov.epart.service.AgencyService;
import za.co.egov.epart.service.ComplaintService;
import za.co.egov.epart.service.DepartmentService;
import za.co.egov.epart.service.ProvinceService;
import za.co.egov.epart.Agency;
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
	private Complaint complaint;
	private List<Complaint> complaints;
	private String selectedAgency;

	@Autowired
	ComplaintService complaintService;

	@Autowired
	AgencyService agencyService;

	private Agency getAgency(String name) {
		Iterator<Agency> it = agencyService.getEntities().iterator();
		while (it.hasNext()) {
			Agency p = it.next();
			if (p.getName().compareTo(name) == 0) {
				return p;
			}
		}
		return null;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	private Log logger = LogFactory.getLog(getClass());

	@PostConstruct
	public void init() {
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
				.getContext();
		WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).getAutowireCapableBeanFactory()
				.autowireBean(this);

	}

	public void searchAction(ActionEvent actionEvent) {
		logger.debug("search for complaints");
		this.setComplaints(complaintService.getEntities(getAgency(selectedAgency)));
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
