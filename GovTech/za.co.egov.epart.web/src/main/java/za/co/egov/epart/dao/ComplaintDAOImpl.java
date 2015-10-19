package za.co.egov.epart.dao;
		
/**
* @author Suresh Pillay
*
*/
import za.co.egov.epart.Complaint;
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
@Repository
public class ComplaintDAOImpl implements ComplaintDAO {
	private static final long serialVersionUID = 1L;
	@Autowired
	private SessionFactory sessionFactory;
	private Session session = null;
	private Transaction transaction = null;
	@Override
	@Transactional
	public void delete(Complaint deleted){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	session.delete(deleted);
	transaction.commit();  
	session.close();
	
	}
	@Override
	@Transactional
	public List<Complaint> findAll(){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Complaint> list = (List<Complaint>) session.createCriteria(Complaint.class).list();
	transaction.commit();  
	session.close();
	return list;
	
	}
	@Override
	@Transactional
	public Optional<Complaint> findOne(Long i){
	session = sessionFactory.openSession();  
	transaction = session.beginTransaction();  
	@SuppressWarnings("unchecked")
	List<Complaint> list = (List<Complaint>) session.createCriteria(Complaint.class).list();
	// Add Restriction
	transaction.commit();  
	session.close();
	return null;
	
	}
	@Override
	@Transactional
	public Complaint save(Complaint persisted){
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
}
