package de.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
/*
 * Plain old Java Object it does not extend as class or implements an interface.
 * The class registers its methods for the HTTP GET request using the @GET annotation.
 * Using the @Produces annotation, it defines that it can deliver several MIME types, text, XML and HTML.
 * The browser requests per default the HTML MIME type.
 */

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Jersey in plain text..........";
 }

//This method is called if XML is request
 @GET
 @Produces(MediaType.TEXT_XML)
 public String sayXMLHello() {
   return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey in XML" + "</hello>";
 }

  // This method is called if HTML is request
  @GET
  @Path("/foo")
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {	  
    return "<html><title>Hello Jersey</title><body><h1>Hello Jersey in html</body></h1></html> ";
  }
  
//This method is called if HTML is request
 @POST
 @Path("/bar")
 @Produces(MediaType.TEXT_HTML)
 public String sayPOSTHello() {
   return "<html> " + "<title>" + "Hello Jersey" + "</title>"
       + "<body><h1>" + "Hello Jersey in html Post" + "</body></h1>" + "</html> ";
 }
 
//This method is for query string parameters
 @GET
 @Path("/fooo")
 //@Produces("text/plain")
 @Produces(MediaType.TEXT_PLAIN)
 public String methodImCalling(@DefaultValue("All") 
                               @QueryParam(value = "item") 
                               final List<String> item) {
    return "values are " + item;
 }
 
//This method is for query string parameters
@GET
@Path("/foo1")
//@Produces("text/plain")
@Produces(MediaType.TEXT_PLAIN)
public String methodImCalling1(@DefaultValue("All1") @QueryParam(value = "item1") final List<String> item1,  
							   @DefaultValue("All2") @QueryParam(value = "item2") final List<String> item2) {
   return "values for first list  are " + item1 + "  /n and values for second list are   " + item2 ;
}
 
//This method is for Post string parameters
@POST
@Path("/foo2")
//@Produces("text/plain")
@Produces(MediaType.TEXT_PLAIN)
public String methodImCalling2(@DefaultValue("All1") @QueryParam(value = "item1") final List<String> item1,  
							   @DefaultValue("All2") @QueryParam(value = "item2") final List<String> item2) {
	
	
 return "In Post of foo2 values for first list  are " + item1 + "  /n and values for second list are   " + item2 ;
}
 
//This method is for Delete string parameters
@DELETE
@Path("/foo3")
//@Produces("text/plain")
@Produces(MediaType.TEXT_PLAIN)
public String methodImCalling3(@DefaultValue("All1") @QueryParam(value = "item1") final List<String> item1,  
							   @DefaultValue("All2") @QueryParam(value = "item2") final List<String> item2) {
	
return "In DElete of foo3 values for first list  are " + item1 + "  /n and values for second list are   " + item2 ;
}

//This method is called if APPLICATION_JSON is request
@GET
@Produces(MediaType.APPLICATION_JSON)
public String sayJSONTextHello() {
 return "Hello Jersey in JSON "
 		+ "{"
 +" 'firstName': 'John',"
 +" 'lastName': 'Smith',"
  +"'isAlive': true,"
 +" 'age': 25,"
 +" 'height_cm': 167.6,"
  +"'address': {"
  +"  'streetAddress': '21 2nd Street',"
   +" 'city': 'New York',"
   +" 'state': 'NY',"
  +"  'postalCode': '10021-3100'"
  +" }"
  +" }";
}

//This method is called if APPLICATION_JSON and  TEXT_PLAIN is request
@GET
@Path("/both")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
public String sayJSON_or_PLainTextTextHello() {
return "Hello Jersey in JSON";
}

//This method is called if APPLICATION_JSON and  TEXT_PLAIN is request
@GET
@Path("/both1")
@Produces({"application/json", "text/plain"})
public String sayJSON_or_PLainTextTextHello1() {
return "Hello Jersey in JSON";
}
/*
//This method is called if HTML is request and for both GET and POST
@GET
@POST
@Path("/foo3")
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHelloForBoth() {	  
 return "<html><title>Hello Jersey</title><body><h1>Hello Jersey in html</body></h1></html> ";
}
*/
/*
//This method is called if HTML is request and for both GET and POST
@POST
@Path("/foo4")
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHelloForPOSTviaGET() {
	
return sayXMLHello();
}
*/


 
 }