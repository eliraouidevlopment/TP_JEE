package exercice6;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AfficherEx6Servlet")
public class AfficherEx6Servlet extends HttpServlet {


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String nom=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("Email");
		String age=request.getParameter("Age");
		String payer=request.getParameter("payer");
		String sexe=request.getParameter("sexe");
		
		
		out.println("<html><body>");
		out.println("<h1>Resume de l'inscreption</h1>");
		out.println("<p>Nom :"+nom);
		out.println("<p>Email :"+age);
		out.println("<p>pays :"+payer);
		out.println("<p>sexe :"+sexe);
		out.println("</body></html>");
	}

}
