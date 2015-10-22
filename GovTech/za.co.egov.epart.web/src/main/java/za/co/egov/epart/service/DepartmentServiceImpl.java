package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
import za.co.egov.epart.dao.DepartmentDAO;
import za.co.egov.epart.service.DepartmentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class DepartmentServiceImpl implements DepartmentService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private DepartmentDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Department o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Department saveEntity(Department o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Department> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Department> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
	@Override
	public List<Department> getEntities(Province o) {
		return dataDao.getByProvince(o);
	}
}
