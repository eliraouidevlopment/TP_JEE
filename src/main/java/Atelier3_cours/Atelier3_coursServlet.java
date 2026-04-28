package Atelier3_cours;


import jakarta.servlet.ServletException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Atelier3_coursServlet")
public class Atelier3_coursServlet extends HttpServlet { 
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("name");
		String prenom=request.getParameter("prenom");
		String sexe=request.getParameter("sexe");
		String Fonction=request.getParameter("Fonction");
		String []loisir=request.getParameterValues("loisir");
		
		String commentaire =request.getParameter("commentaire");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head></head><body>");
		out.println("Nom:"+nom+"<br>");
		out.println("Prenom:"+prenom+"<br>");
		out.println("Sexe:"+sexe+"<br>");
		out.println("Fonction:"+Fonction+"<br>");
		out.println("Loisirs:"+"<br>");
		for(String i:loisir) {
			out.println(i+"<br>");
		}
		
		out.println("commentaire:"+commentaire+"<br>");
		out.println("</body></html>");
		
		
	}

}
