package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.WildAnimals;
import za.co.egov.cn.dao.WildAnimalsDAO;
import za.co.egov.cn.service.WildAnimalsService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class WildAnimalsServiceImpl implements WildAnimalsService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private WildAnimalsDAO dataDao;
	@Override
	@Transactional
	public void delEntity(WildAnimals o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public WildAnimals saveEntity(WildAnimals o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<WildAnimals> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<WildAnimals> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
}
