package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitHistory;
import java.util.List;
import java.util.Optional;
public interface PermitHistoryService  {
	public void delEntity(PermitHistory o);
	public PermitHistory saveEntity(PermitHistory o);
	public List<PermitHistory> getEntities();
	public Optional<PermitHistory> getEntity(Long i);
}
