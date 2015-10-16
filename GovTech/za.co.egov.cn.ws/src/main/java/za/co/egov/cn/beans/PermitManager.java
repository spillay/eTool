/**
 * 
 */
package za.co.egov.cn.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import za.co.egov.cn.Client;

/**
 * @author suresh
 *
 */
public class PermitManager {    
     @PersistenceContext(unitName="punit")  
     EntityManager em;  
  
     public List<Client> findAll() {    
  
          //EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonData"); //returns null    
          //EntityManager em = emf.createEntityManager(); //null pointer exception on this line. emf is null    
          List<Client> list = em.createQuery("SELECT p FROM Client p").getResultList();    
          return list;    
     }    
}   