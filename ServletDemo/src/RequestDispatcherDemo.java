

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo
 */
@WebServlet("/RequestDispatcherDemo")
public class RequestDispatcherDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}

	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("TestServlet says hi<br/>");

		String action = request.getParameter("action");
		if (action != null) {
			System.out.println("it is not null<br/>");
			//RequestDispatcher rd = request.getRequestDispatcher("http://localhost:8080/ServletDemo/fromRequestDispatcher.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("ServletDemo/fromRequestDispatcher.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("fromRequestDispatcher.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/fromRequestDispatcher.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			//RequestDispatcher rd = request.getRequestDispatcher("http://google.com");
			
			System.out.println("Request Dispather got created :" + rd.toString() +"<br/>" );
			if ("include".equalsIgnoreCase(action)) {
				System.out.println("it is included <br/>" );
				rd.include(request, response);
			} else if ("forward".equalsIgnoreCase(action)) {
				System.out.println("it is forwarded <br/>" );
				rd.forward(request, response);
			}
		}
		System.out.println("TestServlet says bye<br/>");

	}

}