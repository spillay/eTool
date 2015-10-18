package za.co.egov.cn.dao;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class ClientDAOImpl implements ClientDAO {
	private static final long serialVersionUID = 1L;
	@Autowired
	private SessionFactory sessionFactory;
	private Session session = null;
	private Transaction transaction = null;
	@Override
	@Transactional
	public void delete(Client deleted){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	session.delete(deleted);
	transaction.commit();  
	session.close();
	
	}
	@Override
	@Transactional
	public List<Client> findAll(){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Client> list = (List<Client>) session.createCriteria(Client.class).list();
	transaction.commit();  
	session.close();
	return list;
	
	}
	@Override
	@Transactional
	public Optional<Client> findOne(Long i){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Client> list = (List<Client>) session.createCriteria(Client.class).list();
	// Add Restriction
	transaction.commit();  
	session.close();
	return null;
	
	}
	@Override
	@Transactional
	public Client save(Client persisted){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	int i =  (int) session.save(persisted);
	transaction.commit();  
	session.close();
	persisted.setId(i);
	return persisted;
	
	}
	@Override
	@Transactional
	public List<Client> getByID(String id){
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		@SuppressWarnings("unchecked")
		List<Client> list = (List<Client>) session.createCriteria(Client.class).add(Restrictions.eq("idno",id)).list();
		Iterator<Client> it = list.iterator();
		while(it.hasNext()){
			Client c = it.next();
			Hibernate.initialize(c.getPERMIT_CLIENTS());
			Iterator<Permit> cit = c.getPERMIT_CLIENTS().iterator();
			while(cit.hasNext()){
				Permit p = cit.next();
				Hibernate.initialize(p.getPermitstatus());
				Hibernate.initialize(p.getPermittype());
			}
		}
		transaction.commit();  
		session.close();
		return list;
	
	}
	public Session getSession(){
		return session;
	}
	public void setSession(Session session){
		this.session=session;
	}
	public Transaction getTransaction(){
		return transaction;
	}
	public void setTransaction(Transaction transaction){
		this.transaction=transaction;
	}
}
