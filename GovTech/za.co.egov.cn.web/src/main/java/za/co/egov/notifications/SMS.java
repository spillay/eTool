package za.co.egov.notifications;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SMS {
	private Log logger = LogFactory.getLog(getClass());
	private String fixCell(String number){
		String cell = number;
		cell = cell.replace("(", "");
		cell = cell.replace(")", "");
		cell = cell.replace("-", "");
		cell = cell.replace(" ", "");
		logger.debug("Cell Number: " + cell);
		return cell;
	}
	public String sendRecvMessage(String toNumber){
		return this.sendSMS(fixCell(toNumber), "Thank you we have received your permit application; and will be processing it shortly,Have a Good Day");
	}
	public String sendApprovedMessage(String toNumber){
		return this.sendSMS(fixCell(toNumber), "Thank you your Permit has been approved, please contact Western Cape Nature, to complete the process");
	}
	public String sendPaidMessage(String toNumber){
		return this.sendSMS(fixCell(toNumber), "Thank you we have received your payment for your permit application");
	}
	private String sendSMS(String toNumber, String message) {

		String reponseMessage = "";

		try {
			String username = "eugeneks";
			String passwd = "Cactus12345";

			// Send data
			URL url = new URL("http://www.mymobileapi.com/api5/http5.aspx?Type=sendparam&username=" + username + "&password=" + passwd + "&numto=" + toNumber + "&data1=" + URLEncoder.encode(message, "ISO-8859-1"));

			URLConnection conn;

			
			conn = url.openConnection();
			
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.flush();

			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;

			StringBuffer buf = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				// Print the response output...
				buf.append(line);
	
			}
			reponseMessage = buf.toString();

			wr.close();
			rd.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return reponseMessage;
	}
	

}

