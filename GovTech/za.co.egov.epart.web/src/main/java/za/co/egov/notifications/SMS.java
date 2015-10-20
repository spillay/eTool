package za.co.egov.notifications;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMS {
	public String sendRecvMessage(String toNumber){
		return this.sendSMS(toNumber, "receivedMesg");
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

