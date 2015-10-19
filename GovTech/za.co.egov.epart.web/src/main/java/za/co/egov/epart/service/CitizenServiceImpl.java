package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Citizen;
import za.co.egov.epart.dao.CitizenDAO;
import za.co.egov.epart.service.CitizenService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class CitizenServiceImpl implements CitizenService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private CitizenDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Citizen o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Citizen saveEntity(Citizen o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Citizen> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Citizen> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
