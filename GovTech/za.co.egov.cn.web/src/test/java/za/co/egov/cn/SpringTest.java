package za.co.egov.cn;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import za.co.egov.cn.service.ClientService;
import za.co.egov.cn.service.PermitStatusService;
import za.co.egov.cn.service.PermitTypeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-servlet.xml"})
@Transactional
public class SpringTest {

	@Autowired
	ClientService dao;
	@Autowired
	PermitTypeService ptService;
	@Autowired
	PermitStatusService psService;
	
	@Test
	public void Test_PermitControlImpl() {
		 try {
				//ptService.saveEntity(new PermitType("Cape Nature - Transport Permit","Transport of protected wild animals within the province",null,null));
				//ptService.saveEntity(new PermitType("WCLA-Temp/Special License","Temporary and Special Liquor Licence",null,null));
					
				psService.saveEntity(new PermitStatus("Submitted", null, null));
				psService.saveEntity(new PermitStatus("Paid", null, null));
				psService.saveEntity(new PermitStatus("Approved", null, null));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void Test_Save() {
		 try {
			   Client c1 = new Client("2123456789","cardno","cardpin","firstname12112", "firstname2", "firstname3", "surname", "telphoneno", "cellno", "email", "email", null);
	
			   Client client = dao.saveEntity(c1);
				
			    System.out.print(client.getFirstname1());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}
