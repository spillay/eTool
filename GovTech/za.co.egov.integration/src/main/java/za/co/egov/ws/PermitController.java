/**
 * 
 */
package za.co.egov.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.PermitypeService;

/**
 * @author suresh
 *
 */
@RestController  
@RequestMapping("/lookup/")
public class PermitController {  
  @Autowired
  PermitypeService dao;
	
 @RequestMapping("/{name}")  
 public PermitInfo getData(@PathVariable String name) {  
	 try {
		dao.addEntity(new PermitType("spear-fishing"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return new PermitInfo(1,name);
 }  
}  

