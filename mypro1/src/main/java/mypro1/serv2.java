package mypro1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class serv2 implements Servlet {

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

	
	public void init(ServletConfig arg0) throws ServletException {
		   System.out.print("servlet init");		
		
	}

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.println("<h2>Hii servlet</h2>");
		String data1=req.getParameter("data1");
		pw.println("<h2>Hello, "+data1 +"This is your response</h2>");
		System.out.print("servlet initialization "+data1);
			
		
	}

}
