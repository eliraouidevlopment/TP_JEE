package exercice3;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Ex3Servlet")
public class Ex3Servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String nom = request.getParameter("nom");
		String mot_passe = request.getParameter("mot_passe");
		
		out.println("<html> <body>");
		out.println("Bienvonnue "+nom+"!");
		out.println("tu as le mot de passe :"+mot_passe);
		
	}

	
}
