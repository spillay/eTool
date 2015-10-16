/**
 * 
 */
package za.co.egov.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author suresh
 *
 */
@XmlRootElement(name = "citizen")
public class PermitInfo {
	@XmlElement
	public void setId(long id) {
		this.id = id;
	}
	@XmlElement
	public void setContent(String content) {
		this.content = content;
	}
	private long id;
    private String content;
    public PermitInfo(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public PermitInfo() {
    }
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
    
}
