/**
 * 
 */
package za.co.egov.cn.ws;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

import za.co.egov.cn.Client;

/**
 * @author suresh
 *
 */
@XmlRootElement(name = "citizen")
public class PermitInfo {
	
	private Client cit;
    private String content;
    public PermitInfo(){
    	content ="Sorry no data found";
    }
    public PermitInfo(Client c) {
        this.cit = c;
        
        StringWriter sw = new StringWriter();
        Marshaller marshaller;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
			marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			 
	        JAXBElement<Client> jaxbElement = new JAXBElement<Client>(new QName(null, "citizen"), Client.class, c);
	        
	        marshaller.marshal(jaxbElement, sw);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		content = sw.toString();
        
    }
	public String getContent() {
		return content;
	}
    
}
