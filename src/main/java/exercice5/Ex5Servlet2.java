package exercice5;

import jakarta.servlet.ServletException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Ex5Servlet2")
public class Ex5Servlet2 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String module=request.getParameter("module");
		String []tab=module.split(",");
		String nom_module=tab[0];
		int prix=Integer.parseInt(tab[1]);
		int papier=Integer.parseInt(tab[2]);
		int electronique=Integer.parseInt(tab[3]);
		int nombre_houres= Integer.parseInt(request.getParameter("NBRheurs"));
		String support_Papier=request.getParameter("Spapier");
		String support_Electronique=request.getParameter("Selectronique");
		
		int Montant=nombre_houres*prix;
		
		if(support_Papier.equals("papier")) {
			Montant+=papier;
		}
		if("electronique".equals(support_Electronique)) {
			Montant+=electronique;
		}
		

		out.println("<html><body>");
		out.println("le module selectionner est :"+nom_module+"<br>");
		out.println("le nombre dr hours est :"+nombre_houres+"<br>");
		out.println("le montant :"+Montant+"<br>");
		out.println("</body></html>");
		
	}

}
