package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.ComplaintType;
import java.util.List;
import java.util.Optional;
public interface ComplaintTypeService  {
	public void delEntity(ComplaintType o);
	public ComplaintType saveEntity(ComplaintType o);
	public List<ComplaintType> getEntities();
	public Optional<ComplaintType> getEntity(Long i);
}
