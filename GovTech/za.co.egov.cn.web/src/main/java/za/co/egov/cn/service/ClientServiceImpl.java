package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
import za.co.egov.cn.dao.ClientDAO;
import za.co.egov.cn.service.ClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class ClientServiceImpl implements ClientService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ClientDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Client o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Client saveEntity(Client o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Client> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Client> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
	@Override
	public Client getByID(String id) {
		return dataDao.getByID(id);
	}
	@Override
	public Client getByCardNo(String cardno) {
		return dataDao.getClient(cardno);
	}
}
