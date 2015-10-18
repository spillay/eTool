package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.PermitStatus;
import java.util.List;
import java.util.Optional;
public interface PermitStatusService  {
	public void delEntity(PermitStatus o);
	public PermitStatus saveEntity(PermitStatus o);
	public List<PermitStatus> getEntities();
	public Optional<PermitStatus> getEntity(Long i);
}
