package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.CapeNature;
import za.co.egov.cn.dao.CapeNatureDAO;
import za.co.egov.cn.service.CapeNatureService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class CapeNatureServiceImpl implements CapeNatureService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private CapeNatureDAO dataDao;
	@Override
	@Transactional
	public void delEntity(CapeNature o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public CapeNature saveEntity(CapeNature o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<CapeNature> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<CapeNature> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
