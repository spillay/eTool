package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitHistory;
import za.co.egov.cn.dao.PermitHistoryDAO;
import za.co.egov.cn.service.PermitHistoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class PermitHistoryServiceImpl implements PermitHistoryService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PermitHistoryDAO dataDao;
	@Override
	@Transactional
	public void delEntity(PermitHistory o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public PermitHistory saveEntity(PermitHistory o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<PermitHistory> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<PermitHistory> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
