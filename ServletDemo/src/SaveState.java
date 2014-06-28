//Saving the state of all the currently loaded servlets 

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveState
 */
@WebServlet("/SaveState")
public class SaveState extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		ServletContext context = getServletContext();
		Enumeration names = context.getServletNames();
		while (names.hasMoreElements()) {
			String name = (String)names.nextElement();
			Servlet servlet = context.getServlet(name);
			out.println("Trying to save the state of " + name + "...");
			out.flush();
			try {
				Method save = servlet.getClass().getMethod("saveState", null);
				save.invoke(servlet, null);
				out.println("Saved!");
			}
			catch (NoSuchMethodException e) {
				out.println("Not saved. This servlet has no saveState() method.");
			}
			catch (SecurityException e) {
				out.println("Not saved. SecurityException: " + e.getMessage());
			}
			catch (InvocationTargetException e) {
				out.print("Not saved. The saveState() method threw an exception: ");
				Throwable t = e.getTargetException();
				out.println(t.getClass().getName() + ": " + t.getMessage());
			}
			catch (Exception e) {
				out.println("Not saved. " + e.getClass().getName() + ": " +
						e.getMessage());
			}

			out.println();
		}
	}

	public String getServletInfo() {
		return "Calls the saveState() method (if it exists) for all the " +
				"currently loaded servlets";
	}
}