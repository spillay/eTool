/**
 * 
 */
package za.co.egov.cn.service;

import java.util.List;

import za.co.egov.cn.Client;

/**
 * @author suresh
 *
 */
public interface ClientService {
	List<Client> getAll();
	Client getByCardNo(String cardno);
}
