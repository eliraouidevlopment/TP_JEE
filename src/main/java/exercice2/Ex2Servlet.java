package exercice2;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.*;

@WebServlet("/Ex2Servlet")

public class Ex2Servlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		Date date= new Date();
		PrintWriter out=res.getWriter();
		out.println("la date ecuelle est "+ "["+date+"]");
	}
}