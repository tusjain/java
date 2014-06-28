//Checking out the currently loaded servlets 

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loaded
 */
@WebServlet("/Loaded")
public class Loaded extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();

		ServletContext context = getServletContext();
		Enumeration names = context.getServletNames();
		while (names.hasMoreElements()) {
			String name = (String)names.nextElement();
			Servlet servlet = context.getServlet(name);
			out.println("Servlet name: " + name);
			out.println("Servlet class: " + servlet.getClass().getName());
			out.println("Servlet info: " + servlet.getServletInfo());
			out.println();
		}
	}
}