package myPackage;
// Import required java libraries
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld1 extends HttpServlet {
 
  private String message;

  public void init() throws ServletException{
      // Do required initialization
      message = "Hello World in myPackage";
      System.out.println(message);
  }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "  in  Post</h1>");
     try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      //destroy();
  }
  
  /**
  public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException{
	  HttpServletRequest request = (HttpServletRequest)req;
	  HttpServletResponse response = (HttpServletResponse)res;
	  doGet(request, response);
  }
  */
 }