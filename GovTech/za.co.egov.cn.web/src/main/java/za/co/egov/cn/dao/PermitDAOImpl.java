package za.co.egov.cn.dao;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitStatus;

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
public class PermitDAOImpl implements PermitDAO {
	private static final long serialVersionUID = 1L;
	@Autowired
	private SessionFactory sessionFactory;
	private Session session = null;
	private Transaction transaction = null;
	@Override
	@Transactional
	public void delete(Permit deleted){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	session.delete(deleted);
	transaction.commit();  
	session.close();
	
	}
	@Override
	@Transactional
	public List<Permit> findAll(){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Permit> list = (List<Permit>) session.createCriteria(Permit.class).list();
	Iterator<Permit> cit = list.iterator();
	while(cit.hasNext()){
		Permit p = cit.next();
		Hibernate.initialize(p.getPermitstatus());
		Hibernate.initialize(p.getPermittype());
		Hibernate.initialize(p.getClient());
	}
	transaction.commit();  
	session.close();
	return list;
	
	}
	@Override
	@Transactional
	public Optional<Permit> findOne(Long i){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Permit> list = (List<Permit>) session.createCriteria(Permit.class).list();
	// Add Restriction
	transaction.commit();  
	session.close();
	return null;
	
	}
	@Override
	@Transactional
	public Permit save(Permit persisted){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	int i =  (int) session.save(persisted);
	transaction.commit();  
	session.close();
	persisted.setId(i);
	return persisted;
	
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
	@Override
	public List<Permit> getPermitsByClient(String clientid) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		@SuppressWarnings("unchecked")
		List<Permit> list = (List<Permit>) session.createCriteria(Permit.class).add(Restrictions.eq("permit_client_id", clientid)).list();
		transaction.commit();  
		session.close();
		return list;
	}
	@Override
	public List<Permit> getPermitsByStatus(String statusid) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		@SuppressWarnings("unchecked")
		List<Permit> list = (List<Permit>) session.createCriteria(Permit.class).add(Restrictions.eq("permit_permitstatus_id", statusid)).list();
		Iterator<Permit> cit = list.iterator();
		while(cit.hasNext()){
			Permit p = cit.next();
			Hibernate.initialize(p.getPermitstatus());
			Hibernate.initialize(p.getPermittype());
			Hibernate.initialize(p.getClient());
		}
		transaction.commit();  
		session.close();
		return list;
	}
	@Override
	public void Update(Permit o) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		session.update(o);
		transaction.commit();  
		session.close();
	}
	@Override
	public List<Permit> getPermitsByStatus(PermitStatus status) {
		session = sessionFactory.openSession();  
		transaction = session.beginTransaction();  
		@SuppressWarnings("unchecked")
		List<Permit> list = (List<Permit>) session.createCriteria(Permit.class).add(Restrictions.eq("permitstatus", status)).list();
		Iterator<Permit> cit = list.iterator();
		while(cit.hasNext()){
			Permit p = cit.next();
			Hibernate.initialize(p.getPermitstatus());
			Hibernate.initialize(p.getPermittype());
			Hibernate.initialize(p.getClient());
		}
		transaction.commit();  
		session.close();
		return list;
	}
}
