/**
 * 
 */
package za.co.egov.cn.dao;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import za.co.egov.cn.Client;

/**
 * @author suresh
 *
 */
@Repository
public class ClientDAOImpl implements ClientDAO {

	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired  
	 SessionFactory sessionFactory;  
	  
	 Session session = null;  
	 Transaction tx = null;  
	  
	@Override
	@Transactional
	public Client getClient(String cardno) {
		 session = sessionFactory.openSession();  
		 tx = session.beginTransaction();  
		 @SuppressWarnings("unchecked")
		 List<Client> list = (List<Client>) session
					.createCriteria(Client.class).add(Restrictions.eq("cardno", cardno)).list();
		  
		  tx.commit();  
		  session.close();
		  if (list.size() > 0){
			  return list.get(0);
		  }
		  return null;
	}

	@Override
	@Transactional
	public void delete(Client deleted) {
		  session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		  session.delete(deleted);
		  tx.commit();  
		  session.close();
		
	}

	@Override
	@Transactional
	public List<Client> findAll() {
		//session = sessionFactory.getCurrentSession();
		session = sessionFactory.openSession();  
		tx = session.beginTransaction();  
		@SuppressWarnings("unchecked")
		List<Client> list = (List<Client>) session
				.createCriteria(Client.class).list();
				//.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		tx.commit();  
		session.close();
		return list;
	}

	@Override
	public Optional<Client> findOne(Long id) {
		  session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		 // Client o = (Client) session.createQuery("")
				  
		  tx.commit();  
		  session.close();
		  return null;
	}

	@Override
	public Client save(Client persisted) {
		  session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		  Client o = (Client) session.save(persisted);
		  tx.commit();  
		  session.close();
		  return o;
	}

}
