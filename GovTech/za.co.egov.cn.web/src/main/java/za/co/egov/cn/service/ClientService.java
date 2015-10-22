package za.co.egov.cn.service;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
import java.util.List;
import java.util.Optional;
public interface ClientService  {
	public void delEntity(Client o);
	public Client saveEntity(Client o);
	public List<Client> getEntities();
	public Optional<Client> getEntity(Long i);
	public Client getByID(String id);
	Client getByCardNo(String cardno);

}
