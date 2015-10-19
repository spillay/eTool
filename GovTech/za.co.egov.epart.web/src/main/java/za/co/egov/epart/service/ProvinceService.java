package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Province;
import java.util.List;
import java.util.Optional;
public interface ProvinceService  {
	public void delEntity(Province o);
	public Province saveEntity(Province o);
	public List<Province> getEntities();
	public Optional<Province> getEntity(Long i);
}
