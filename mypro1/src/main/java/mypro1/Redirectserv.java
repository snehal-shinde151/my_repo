package mypro1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/path")
public class Redirectserv extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
		String name=req.getParameter("data1");
		PrintWriter pw= res.getWriter();
        pw.println("Hello" +name);
    	System.out.println("Welcome to get method");
        res.sendRedirect("/login.html");
  }
}
