/**
 * 
 */
package za.co.egov.cn.dao;

import za.co.egov.cn.Client;
/**
 * @author suresh
 *
 */
public interface ClientDAO extends BaseRepository<Client,Long> {
	Client getClient(String cardno);
}
