package za.co.egov.cn.dao;
		
import java.util.List;

/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
public interface ClientDAO extends BaseRepository<Client,Long> {
	public List<Client> getByID(String id);
	Client getClient(String cardno);
}
