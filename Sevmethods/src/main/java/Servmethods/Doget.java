package Servmethods;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Doget extends HttpServlet{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  out.println("<h1>Hello, servlet!</h1>");
}	  
}
