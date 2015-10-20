package za.co.egov.epart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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
	ComplaintHelpService complaintHelpService;
	
	@Autowired
	ComplaintTypeService complaintTypeService;
	public void updateComplaints(){
		ComplaintType gen = new ComplaintType("General", null);
	 	ComplaintType del = new ComplaintType("Delivery Department", null);
	 	ComplaintType mn = new ComplaintType("Minister's Office", null);
	
	 	complaintTypeService.saveEntity(gen);
	 	complaintTypeService.saveEntity(del);
	 	complaintTypeService.saveEntity(mn);
	 	
		complaintHelpService.saveEntity(new ComplaintHelp("when","When can I come collect my ID:",del));
	 	complaintHelpService.saveEntity(new ComplaintHelp("i","have received my ID:",del));
	 	complaintHelpService.saveEntity(new ComplaintHelp("i","have not received a collection notification my reference no is:",del));
	 	complaintHelpService.saveEntity(new ComplaintHelp("department","The Department has lost my ID",mn));

	}
	@Test
	public void Test_PermitControlImpl() {
		 try {
			 	List<Province> da = provService.getEntities();
			 	provService.saveEntity(new Province("Gauteng"));
			 	provService.saveEntity(new Province("Western Cape"));
			 	
			 	
			 	deptService.saveEntity(new Department("Western Cape Nature", null));
			 	deptService.saveEntity(new Department("Western Cape Liquor", null));
			 	
			 	updateComplaints();
			 	
			 	
			 		 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
