package za.co.egov.cn.service;
		
import za.co.egov.cn.Client;
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitStatus;

import java.util.List;
import java.util.Optional;
public interface PermitService  {
	public void delEntity(Permit o);
	public Permit saveEntity(Permit o);
	public List<Permit> getEntities();
	public Optional<Permit> getEntity(Long i);
	public List<Permit> getByStatus(PermitStatus p);
	public void updateEntity(Permit o);
}
