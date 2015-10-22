package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Agency;
import za.co.egov.epart.Department;

import java.util.List;
import java.util.Optional;
public interface AgencyService  {
	public void delEntity(Agency o);
	public Agency saveEntity(Agency o);
	public List<Agency> getEntities();
	public Optional<Agency> getEntity(Long i);
	public List<Agency> getEntities(Department o);
}
