package za.co.egov.epart.dao;
		
import java.util.List;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Complaint;
import za.co.egov.epart.Department;
import za.co.egov.epart.Province;
public interface ComplaintDAO extends BaseRepository<Complaint,Long> {
	List<Complaint> getComplaints(Province p,Department d);
}
