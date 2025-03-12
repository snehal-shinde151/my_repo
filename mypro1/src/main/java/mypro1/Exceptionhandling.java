package mypro1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exceptionhandling extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
	  try {
		  int result=10/0;
	  }
	  catch(ArithmeticException e) {
		  res.getWriter().println("Error: Division by zero is not allowed.");
	  }
  }
}
