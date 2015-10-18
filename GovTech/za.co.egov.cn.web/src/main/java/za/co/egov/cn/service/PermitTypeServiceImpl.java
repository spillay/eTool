package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitType;
import za.co.egov.cn.dao.PermitTypeDAO;
import za.co.egov.cn.service.PermitTypeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class PermitTypeServiceImpl implements PermitTypeService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private PermitTypeDAO dataDao;
	@Override
	@Transactional
	public void delEntity(PermitType o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public PermitType saveEntity(PermitType o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<PermitType> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<PermitType> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
