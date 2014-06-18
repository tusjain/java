

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowError")
public class ShowError extends HttpServlet {
	private static final long serialVersionUID = 6L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		errorMethod(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		errorMethod(request, response);
	}
	
	private void errorMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(407, "Need authentication!!!999");
	}

}
