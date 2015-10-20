package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitStatus;
import za.co.egov.cn.dao.PermitDAO;
import za.co.egov.cn.service.PermitService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class PermitServiceImpl implements PermitService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PermitDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Permit o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Permit saveEntity(Permit o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Permit> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Permit> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
	@Override
	public void updateEntity(Permit o) {
		dataDao.Update(o);
		
	}
	@Override
	public List<Permit> getByStatus(PermitStatus p) {
		return dataDao.getPermitsByStatus(p);
	}
}
