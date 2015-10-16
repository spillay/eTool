/**
 * 
 */
package za.co.egov.ws;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suresh
 *
 */
@RestController  
@RequestMapping("/lookup/")
public class PermitController {  
 @RequestMapping("/{name}")  
 public PermitInfo getData(@PathVariable String name) {  
  return new PermitInfo(1,name);
 }  
}  

