package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.CapeNature;
import java.util.List;
import java.util.Optional;
public interface CapeNatureService  {
	public void delEntity(CapeNature o);
	public CapeNature saveEntity(CapeNature o);
	public List<CapeNature> getEntities();
	public Optional<CapeNature> getEntity(Long i);
}
