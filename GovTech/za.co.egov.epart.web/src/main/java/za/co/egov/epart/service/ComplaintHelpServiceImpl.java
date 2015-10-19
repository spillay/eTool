package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.ComplaintHelp;
import za.co.egov.epart.dao.ComplaintHelpDAO;
import za.co.egov.epart.service.ComplaintHelpService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class ComplaintHelpServiceImpl implements ComplaintHelpService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ComplaintHelpDAO dataDao;
	@Override
	@Transactional
	public void delEntity(ComplaintHelp o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public ComplaintHelp saveEntity(ComplaintHelp o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<ComplaintHelp> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<ComplaintHelp> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
