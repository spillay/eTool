/**
 * 
 */
package za.co.egov.cn.ws;

import za.co.egov.cn.Client;
import za.co.egov.cn.Permit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author suresh
 *
 */
import com.google.gson.Gson;

public class ClientHelper {
	 private String idno;
     private String cardno;
     private String cardpin;
     private String firstname1;
     private String firstname2;
     private String firstname3;
     private String surname;
     private String telphoneno;
     private String cellno;
     private String email;
     private String prefContact;
     private List<PermitHelper> permits;
     public ClientHelper(){
     }
	public ClientHelper(Client c){
		this.idno = c.getIdno().replaceAll("-", "");
		this.cardno = c.getCardno();
		this.cardpin = c.getCellno();
		this.firstname1 = c.getFirstname1();
		this.firstname2 = c.getFirstname2();
		this.firstname3 = c.getFirstname3();
		this.surname = c.getSurname();
		this.telphoneno = c.getTelphoneno();
		this.cellno = c.getCellno();
		this.email = c.getEmail();
		this.prefContact = c.getPrefContact();
		permits = new ArrayList<PermitHelper>();
		Iterator<Permit> it = c.getPERMIT_CLIENTS().iterator();
		while(it.hasNext()){
			Permit p = it.next();
			permits.add(new PermitHelper(p));
		}
	}
	public String getData(){
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	public String getWData(Client c){
		String val = "";
		val+="idno:" + c.getIdno().replaceAll("-", "");
		val+="\n";
		val+="cardno:" + c.getCardno();
		val+="\n";
		val+="cardpin:" + c.getCardpin();
		val+="\n";
		val+="firstname1:" + c.getFirstname1();
		val+="\n";
		val+="firstname2:" + c.getFirstname2();
		val+="\n";
		val+="firstname3:" + c.getFirstname3();
		val+="\n";
		val+="surname:" + c.getSurname();
		val+="\n";
		val+="telphoneno:" + c.getTelphoneno();
		val+="\n";
		val+="cellno:" + c.getCellno();
		val+="\n";
		val+="email:" + c.getEmail();
		val+="\n";
		val+="prefContact:" + c.getPrefContact();
		val+="\n";
		Iterator<Permit> it = c.getPERMIT_CLIENTS().iterator();
		while(it.hasNext()){
			Permit p = it.next();
			PermitHelper ph = new PermitHelper();
			val += "##PERMIT##\n";
			val += ph.getWData(p);		
		}
		return val;

	}
}
