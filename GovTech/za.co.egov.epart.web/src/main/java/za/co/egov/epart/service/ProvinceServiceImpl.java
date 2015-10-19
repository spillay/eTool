package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Province;
import za.co.egov.epart.dao.ProvinceDAO;
import za.co.egov.epart.service.ProvinceService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class ProvinceServiceImpl implements ProvinceService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ProvinceDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Province o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Province saveEntity(Province o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Province> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Province> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
