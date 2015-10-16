/**
 * 
 */
package za.co.egov.cn.ws;

/**
 * @author suresh
 *
 */
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;


public class WSApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public WSApplication() {
		singletons.add(new PermitService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}


