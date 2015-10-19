/**
 * 
 */
package za.co.egov.cn.ws;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.egov.cn.Client;
import za.co.egov.cn.PermitType;
import za.co.egov.cn.service.ClientService;
import za.co.egov.cn.service.PermitTypeService;

/**
 * @author suresh
 *
 */
@RestController  
@RequestMapping("/lookup/")
public class PermitController {  
 
 protected final Log logger = LogFactory.getLog(getClass());
	
 @Autowired
 ClientService dao;
	
 @RequestMapping("/{name}")  
 public String getData(@PathVariable String name) {  
	 try {
		Client c = dao.getByCardNo(name);
		if ( c == null){
			logger.info("No client found with cardno: " + name);
		}
		ClientHelper ch = new ClientHelper(c);
		//PermitInfo p =  new PermitInfo(c);
		logger.info("Client Info: " + ch.getWData(c));
		return ch.getWData(c);
	 } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	 return (new PermitInfo()).getContent();
	 
 }  
}  

