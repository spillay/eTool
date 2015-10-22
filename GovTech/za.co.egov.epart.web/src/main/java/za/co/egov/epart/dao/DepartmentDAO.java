package za.co.egov.epart.dao;
		
import java.util.List;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
public interface DepartmentDAO extends BaseRepository<Department,Long> {
	public List<Department> getByProvince(Province o);
}
