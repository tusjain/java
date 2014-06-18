

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "This is my second servlet in which I want to use Service method", urlPatterns = { "/secser" })
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
	  private String message;
  
    
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException{
        // Do required initialization
        message = "Hello World9999999999999999";
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		doPost(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + " I am via Post</h1>");
	}

}
