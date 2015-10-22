package za.co.egov.epart.dao;
		
import java.util.List;

import za.co.egov.epart.Agency;
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Complaint;
public interface ComplaintDAO extends BaseRepository<Complaint,Long> {
	public List<Complaint> find(Agency o);
}
