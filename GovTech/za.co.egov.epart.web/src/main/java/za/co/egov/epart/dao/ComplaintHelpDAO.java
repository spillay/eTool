package za.co.egov.epart.dao;
		
import java.util.List;

import za.co.egov.epart.Agency;
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.ComplaintHelp;
public interface ComplaintHelpDAO extends BaseRepository<ComplaintHelp,Long> {
	public List<ComplaintHelp> findby(Agency o);
}
