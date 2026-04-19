package exercice6;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Ex6Servlet")
public class Ex6Servlet extends HttpServlet {
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("login");
		String Password=request.getParameter("password");
		HttpSession s=request.getSession();
		s.setAttribute("validation","not ok");
		
		
		if("chakib".equals(login) && "1234".equals(Password)) {
			s.setAttribute("validation","ok");
			response.sendRedirect("FormulaireEx6.jsp");
		}else {
			
			response.sendRedirect("loginEx6.html");
		}
	}

}
