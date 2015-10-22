package za.co.egov.epart.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;

import java.util.List;
import java.util.Optional;
public interface DepartmentService  {
	public void delEntity(Department o);
	public Department saveEntity(Department o);
	public List<Department> getEntities();
	public Optional<Department> getEntity(Long i);
	public List<Department> getEntities(Province o);
}
