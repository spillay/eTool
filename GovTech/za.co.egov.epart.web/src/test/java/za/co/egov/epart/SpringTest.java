package za.co.egov.epart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import za.co.egov.epart.service.ProvinceService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-servlet.xml"})
@Transactional
public class SpringTest {

	//@Autowired
	//ClientService dao;
	
	@Autowired
	ProvinceService provService;
	
	@Test
	public void Test_PermitControlImpl() {
		 try {
			 	List<Province> da = provService.getEntities();
			 	System.out.println(da.size());
				//List<Client> clients = dao.getAll();
				//if ( clients.size() > 0){
				//	PermitInfo o = new PermitInfo(clients.get(0));
				//	System.out.print(o.getContent());
				//}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
