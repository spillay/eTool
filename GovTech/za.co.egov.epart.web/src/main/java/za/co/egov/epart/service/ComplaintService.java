package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Complaint;
import java.util.List;
import java.util.Optional;
public interface ComplaintService  {
	public void delEntity(Complaint o);
	public Complaint saveEntity(Complaint o);
	public List<Complaint> getEntities();
	public Optional<Complaint> getEntity(Long i);
}
