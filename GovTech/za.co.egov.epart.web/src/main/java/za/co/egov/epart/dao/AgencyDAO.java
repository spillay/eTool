package za.co.egov.epart.dao;
		
import java.util.List;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Agency;
import za.co.egov.epart.Department;

public interface AgencyDAO extends BaseRepository<Agency,Long> {
	public List<Agency> getByDepartment(Department o);
}
