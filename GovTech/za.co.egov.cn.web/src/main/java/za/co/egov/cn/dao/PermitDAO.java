package za.co.egov.cn.dao;
		
import java.util.List;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitStatus;
public interface PermitDAO extends BaseRepository<Permit,Long> {
	List<Permit> getPermitsByClient(String clientid);
	List<Permit> getPermitsByStatus(String statusid);
	List<Permit> getPermitsByStatus(PermitStatus status);
	void Update(Permit o);
}
