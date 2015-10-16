package za.co.egov.cn.ws;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.annotations.NamedQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;
import za.co.egov.cn.PermitStatus;
import za.co.egov.cn.PermitType;

public class EMTest {
	private static EntityManager em;
	 
	
	public void createPermit(String no,PermitType pt,PermitStatus ps,Client c){
		em.getTransaction().begin();
        Permit p = new Permit();
        p.setPermitNo(no);
        p.setPermittype(pt);
        p.setClient(c);
        p.setPermitstatus(ps);
        em.persist(p);
        em.getTransaction().commit();
	}
	@Before
	public void setupDB(){
		cleanup();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("punit");
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        PermitType p1 = new PermitType();
        p1.setName("Fishing");
        em.persist(p1);
        
        PermitType p2 = new PermitType();
        p2.setName("Hunting");
        em.persist(p2);
       
        
        PermitStatus pS1 = new PermitStatus();
        pS1.setStatus("Submitted");
        em.persist(pS1);
        
        PermitStatus pS2 = new PermitStatus();
        pS2.setStatus("Accepted");
        em.persist(pS2);
        
        Client c = new Client("1123456789", "firstname1", "firstname2", "firstname3", "surname", "telphoneno", "cellno", "email", "email");
        em.persist(c);
        
        
        
        
        
        
        
        
        Client c1 = new Client("2123456789", "firstname1", "firstname2", "firstname3", "surname", "telphoneno", "cellno", "email", "email");
        em.persist(c1);
        
        Client c2 = new Client("3123456789", "firstname1", "firstname2", "firstname3", "surname", "telphoneno", "cellno", "email", "email");
        em.persist(c2);
        
        em.getTransaction().commit();
        createPermit("1",p2,pS1,c);
        createPermit("2",p2,pS1,c2);
        createPermit("3",p2,pS1,c2);
        
	}
	
	@Test
	public void getData() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("punit");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List res = em.createQuery(
        	    "SELECT c FROM Client c WHERE c.idNo LIKE :custID")
        	    .setParameter("custID", "2123456789")
        	    .setMaxResults(10)
        	    .getResultList();
        Iterator<Client> it = res.iterator();
        while(it.hasNext()){
        	Client o = it.next();
        	System.out.println("Found Client" + o.getIdNo());
        }
        em.getTransaction().commit();
        
	}
	public void cleanup(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("punit");
        em = emf.createEntityManager();
        em.getTransaction().begin();
		
		em.createQuery(
			    "DELETE FROM PermitHistory").executeUpdate();
		em.createQuery(
			    "DELETE FROM Permit").executeUpdate();
		em.createQuery(
			    "DELETE FROM Client").executeUpdate();
		em.createQuery(
			    "DELETE FROM PermitType").executeUpdate();
		em.createQuery(
			    "DELETE FROM PermitStatus").executeUpdate();
		em.getTransaction().commit();
			    
	}

}
