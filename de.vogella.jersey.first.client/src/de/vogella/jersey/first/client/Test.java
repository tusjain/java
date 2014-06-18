package de.vogella.jersey.first.client;

import java.net.URI;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Test {
  public static void main(String[] args) {
	ClientConfig config = new DefaultClientConfig();
    Client client = Client.create(config);
    WebResource service = client.resource(getBaseURI());
    // Fluent interfaces
    System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
    // Get plain text
    //System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_PLAIN).get(String.class));
    // Get XML
    //System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_XML).get(String.class));
    // The HTML
    //System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_HTML).get(String.class));
    // get HTML but with method specific path
    //System.out.println(service.path("rest").path("hello/foo").accept(MediaType.TEXT_HTML).get(String.class));
    //POST
    //System.out.println(service.path("rest").path("hello/bar").accept(MediaType.TEXT_HTML).post(String.class));
    // GET with parameters
    //System.out.println(service.path("rest").path("hello").queryParam("item", "5").accept(MediaType.TEXT_PLAIN).get(String.class));
    //http://localhost:8080/de.vogella.jersey.first/rest/hello?a=5&b=6
    //System.out.println(service.path("rest").path("hello/foo").queryParam("item", "5").accept(MediaType.TEXT_PLAIN).get(String.class));
    //http://localhost:8080/de.vogella.jersey.first/rest/hello/foo?item=5
    
    // Get JSON text
   // System.out.println(service.path("rest").path("hello").accept(MediaType.APPLICATION_JSON).get(String.class));
    
   // System.out.println(service.path("rest").path("hello/both").accept(MediaType.APPLICATION_JSON).get(String.class));
    
   System.out.println(" hello print hard coxded string");
  }

  private static URI getBaseURI() {
    return UriBuilder.fromUri("http://localhost:8080/de.vogella.jersey.first").build();
  }
}