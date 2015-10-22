package za.co.egov.epart.service;
		
import za.co.egov.epart.Agency;
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.ComplaintHelp;
import java.util.List;
import java.util.Optional;
public interface ComplaintHelpService  {
	public void delEntity(ComplaintHelp o);
	public ComplaintHelp saveEntity(ComplaintHelp o);
	public List<ComplaintHelp> getEntities();
	public Optional<ComplaintHelp> getEntity(Long i);
	public List<ComplaintHelp> getEntities(Agency o);
}
