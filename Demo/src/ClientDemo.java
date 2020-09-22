import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

public class ClientDemo {

	public static void main(String[] args) {
		
		Client client = javax.ws.rs.client.ClientBuilder.newClient();
		WebTarget target = client.target("http://pbcp-remarket.cloud.primary.com.ar/rest/segment/all").queryParam("X-Username", "esisack2057").queryParam("X-Password", "cpnlnD9*");
		
		
		System.out.println(target.request(MediaType.APPLICATION_JSON).get().getHeaders());

	}

}
