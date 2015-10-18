package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitType;
import java.util.List;
import java.util.Optional;
public interface PermitTypeService  {
	public void delEntity(PermitType o);
	public PermitType saveEntity(PermitType o);
	public List<PermitType> getEntities();
	public Optional<PermitType> getEntity(Long i);
}
