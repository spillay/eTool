/**
 * 
 */
package za.co.egov.cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import za.co.egov.cn.Client;
import za.co.egov.cn.dao.ClientDAO;

/**
 * @author suresh
 *
 */
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired  
	ClientDAO dataDao;

	@Override
	@Transactional
	public List<Client> getAll() {
		return dataDao.findAll();
	}

	@Override
	public Client getByCardNo(String cardno) {
		return dataDao.getClient(cardno);
	}  
	
}
