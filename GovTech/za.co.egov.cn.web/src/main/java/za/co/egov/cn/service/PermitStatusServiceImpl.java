package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitStatus;
import za.co.egov.cn.dao.PermitStatusDAO;
import za.co.egov.cn.service.PermitStatusService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class PermitStatusServiceImpl implements PermitStatusService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PermitStatusDAO dataDao;
	@Override
	@Transactional
	public void delEntity(PermitStatus o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public PermitStatus saveEntity(PermitStatus o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<PermitStatus> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<PermitStatus> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
