package za.co.egov.epart;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import za.co.egov.epart.service.AgencyService;
import za.co.egov.epart.service.ComplaintHelpService;
import za.co.egov.epart.service.ComplaintTypeService;
import za.co.egov.epart.service.DepartmentService;
import za.co.egov.epart.service.ProvinceService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-servlet.xml"})
@Transactional
public class SpringTest {

	//@Autowired
	//ClientService dao;
	
	@Autowired
	ProvinceService provService;
	
	@Autowired
	DepartmentService deptService;
	
	@Autowired
	AgencyService agencyService;
	
	@Autowired
	ComplaintHelpService complaintHelpService;
	
	@Autowired
	ComplaintTypeService complaintTypeService;
	
	private Department getDepartment(String dept,Province p){
		Iterator<Department> it = deptService.getEntities(p).iterator();
		while(it.hasNext()){
			Department d = it.next();
			if (d.getName().compareTo(dept)==0){
				return d;
			}
		}
		return null;
	}
	private Province getProvince(String name){
		Iterator<Province> it = provService.getEntities().iterator();
		while(it.hasNext()){
			Province p = it.next();
			if (p.getName().compareTo(name)==0){
				return p;
			}
		}
		return null;
	}
	private Agency getAgency(String name,Department d){
		Iterator<Agency> it = agencyService.getEntities(d).iterator();
		while(it.hasNext()){
			Agency o = it.next();
			if (o.getName().compareTo(name)==0){
				return o;
			}
		}
		return null;
	}
	private ComplaintType getComplaintType(String name){
		Iterator<ComplaintType> it = complaintTypeService.getEntities().iterator();
		while(it.hasNext()){
			ComplaintType o = it.next();
			if (o.getName().compareTo(name)==0){
				return o;
			}
		}
		return null;
	}
	
	public void addData(String province,String department,String agency){
		Province p = getProvince(province);
		if ( p == null){
			Province gt = new Province(province,null);
			p = provService.saveEntity(gt);
		}
		
		Department d = getDepartment(department,p);
		if ( d == null){
			Department dp = new Department(department,p,null);
			d = deptService.saveEntity(dp);
		}
		

		Agency a = getAgency(agency,d);
		if ( a == null){
			Agency ay = new Agency(agency,d,null,null);
			a = agencyService.saveEntity(ay);
		}
		
		//ComplaintHelp ch = new ComplaintHelp("when","When can I come collect my ID:",del,a);
		//complaintHelpService.saveEntity(ch);
	}
	public ComplaintType addComplaintType(String type){
		ComplaintType p = getComplaintType(type);
		if ( p == null){
			ComplaintType gen = new ComplaintType("General", null);
			p = complaintTypeService.saveEntity(gen);
		}
		return p;
	}
	public void updateComplaints(String key,String val,String agency,String complaintType){
		//ComplaintType gen = new ComplaintType("General", null);
	 	//ComplaintType del = new ComplaintType("Delivery Department", null);
	 	//ComplaintType mn = new ComplaintType("Minister's Office", null);
	
	 	//complaintTypeService.saveEntity(gen);
	 	//complaintTypeService.saveEntity(del);
	 	//complaintTypeService.saveEntity(mn);
		Iterator<Agency> a = agencyService.getEntities().iterator();
	 	int fd = 0;
		while(a.hasNext()){
	 		Agency o = a.next();
	 		if ( o.getName().compareTo(agency) ==0){
	 			ComplaintHelp ch = new ComplaintHelp(key, val, o,addComplaintType("General"));
	 		 	complaintHelpService.saveEntity(ch);
	 		 	fd = 1;
	 		}
	 	}
		if ( fd == 0){
			System.out.println("Failed to insert complaint:" + key + " : " + val);
		}
		//complaintHelpService.saveEntity(new ComplaintHelp("when","When can I come collect my ID:",del));
	 	//complaintHelpService.saveEntity(new ComplaintHelp("i","have received my ID:",del));
	 	//complaintHelpService.saveEntity(new ComplaintHelp("i","have not received a collection notification my reference no is:",del));
	 	//complaintHelpService.saveEntity(new ComplaintHelp("department","The Department has lost my ID",mn));

	}
	@Test
	public void Test_PermitControlImpl() {
		 try {
			 	List<Province> da = provService.getEntities();
			 	this.addData("Gauteng", "Police", "Traffic Department");
			 	this.addData("Western Cape", "Police", "Traffic Department");
			 	this.addData("Western Cape", "Safety and Secuirty", "Fire Services");
			 	
			 	addComplaintType("General");
			 	
			 	updateComplaints("when","When can I come collect my ID:","Traffic Department","General");
			 	
			 	
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
