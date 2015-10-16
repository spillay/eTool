/**
 * 
 */
package za.co.egov.cn.service;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.egov.cn.PermitType;
import za.co.egov.cn.dao.PermittypeDAO;

/**
 * @author suresh
 *
 */
public class PermitypeServiceImpl implements PermitypeService {
	@Autowired  
	PermittypeDAO dataDao;  
	
	@Override
	public boolean addEntity(PermitType o) throws Exception {
		dataDao.save(o);
		return true;
	}

}
