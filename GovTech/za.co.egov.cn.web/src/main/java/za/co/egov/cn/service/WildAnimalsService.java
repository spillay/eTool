package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.WildAnimals;
import java.util.List;
import java.util.Optional;
public interface WildAnimalsService  {
	public void delEntity(WildAnimals o);
	public WildAnimals saveEntity(WildAnimals o);
	public List<WildAnimals> getEntities();
	public Optional<WildAnimals> getEntity(Long i);
}
