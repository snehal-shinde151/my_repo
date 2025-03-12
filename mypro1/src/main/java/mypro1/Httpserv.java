package mypro1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/path")
public class Httpserv extends HttpServlet{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	
	
	res.setContentType("text/html");
	String name=req.getParameter("data");
	PrintWriter pw= res.getWriter();
	pw.println("Hello" +name);
	System.out.println("Welcome to get method");
	//RequestDispatcher rd= req.getRequestDispatcher("/reqdis.html");
	//rd.forward(req,res);
	
}

}
