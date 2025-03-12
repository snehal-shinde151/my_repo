package Servmethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Dopost extends HttpServlet {
	public void doPost(HttpServletRequest reqs,HttpServletResponse resp) throws ServletException, IOException{
		
		String username= reqs.getParameter("username");
		String password= reqs.getParameter("password");

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>Welcome, " + username + "!</h1>");


		}
		

}
