package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.ComplaintType;
import za.co.egov.epart.dao.ComplaintTypeDAO;
import za.co.egov.epart.service.ComplaintTypeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class ComplaintTypeServiceImpl implements ComplaintTypeService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ComplaintTypeDAO dataDao;
	@Override
	@Transactional
	public void delEntity(ComplaintType o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public ComplaintType saveEntity(ComplaintType o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<ComplaintType> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<ComplaintType> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
