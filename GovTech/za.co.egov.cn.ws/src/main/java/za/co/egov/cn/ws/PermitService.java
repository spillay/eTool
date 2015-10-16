/**
 * 
 */
package za.co.egov.cn.ws;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import za.co.egov.cn.Client;
import za.co.egov.cn.beans.PermitManager;

/**
 * @author suresh
 *
 */
@Path("/message")
public class PermitService {
	@Inject
    private PermitManager manager;
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("punit");
		/*
		if ( emf != null){
		EntityManager em = emf.createEntityManager();
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
        	result += o.getIdNo();
        }
        
        em.getTransaction().commit();
		} else {
			result += "problem";
		}
		*/
		return Response.status(200).entity(result).build();

	}

}