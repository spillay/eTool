package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Complaint;
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
import za.co.egov.epart.dao.ComplaintDAO;
import za.co.egov.epart.service.ComplaintService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public class ComplaintServiceImpl implements ComplaintService {
	private static final long serialVersionUID = 1L;
	@Autowired
	private ComplaintDAO dataDao;
	@Override
	@Transactional
	public void delEntity(Complaint o){
	dataDao.delete(o);
	
	}
	@Override
	@Transactional
	public Complaint saveEntity(Complaint o){
	return dataDao.save(o);
	
	}
	@Override
	@Transactional
	public List<Complaint> getEntities(){
	return dataDao.findAll();
	
	}
	@Override
	@Transactional
	public Optional<Complaint> getEntity(Long i){
	return dataDao.findOne(i);
	
	}
	@Override
	public List<Complaint> getEntitiesby(Province p, Department d) {
		return dataDao.getComplaints(p, d);
	}
}
