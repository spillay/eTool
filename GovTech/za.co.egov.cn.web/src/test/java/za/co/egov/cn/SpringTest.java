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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-servlet.xml"})
@Transactional
public class SpringTest {

	@Autowired
	ClientService dao;
	
	@Test
	public void Test_PermitControlImpl() {
		 try {
				List<Client> clients = dao.getEntities();
				if ( clients.size() > 0){
					System.out.print(clients.get(0).getFirstname1());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Test
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
