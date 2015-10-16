/**
 * 
 */
package za.co.egov.cn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import za.co.egov.cn.PermitType;

/**
 * @author suresh
 *
 */
public class PermittypeDAOImpl implements PermittypeDAO{

	 @Autowired  
	 SessionFactory sessionFactory;  
	  
	 Session session = null;  
	 Transaction tx = null;  
	  
	 
	@Override
	public boolean save(PermitType o) {
		  session = sessionFactory.openSession();  
		  tx = session.beginTransaction();  
		  session.save(o);  
		  tx.commit();  
		  session.close();  
		  return true;
	}

}
