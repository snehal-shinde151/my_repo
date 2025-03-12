package Mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo1 implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
    System.out.print("servlet initialization");		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     res.setContentType("text/html");
     PrintWriter pw = res.getWriter();
     pw.println("<h2>hii servlet working</h2>");
     String data1=req.getParameter("data");
     pw.println("<h2>Hello, "+data1 +" This is your response</h2>");
     System.out.print("servlet initialization");
     
	}

}

