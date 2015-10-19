package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Citizen;
import java.util.List;
import java.util.Optional;
public interface CitizenService  {
	public void delEntity(Citizen o);
	public Citizen saveEntity(Citizen o);
	public List<Citizen> getEntities();
	public Optional<Citizen> getEntity(Long i);
}
