package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Agency;
import za.co.egov.epart.Department;
import za.co.egov.epart.dao.AgencyDAO;
import za.co.egov.epart.service.AgencyService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class AgencyServiceImpl implements AgencyService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private AgencyDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Agency o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Agency saveEntity(Agency o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Agency> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Agency> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
	@Override
	public List<Agency> getEntities(Department o) {
		return dataDao.getByDepartment(o);
	}
}
