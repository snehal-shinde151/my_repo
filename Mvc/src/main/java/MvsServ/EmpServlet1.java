package MvsServ;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet1  extends HttpServlet{
	
    public void init(HttpServletRequest request , HttpServletResponse response) {
    	EmpServlet1 e= new EmpServlet1();
    	 
    }

	public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException {
		res.sendRedirect("emp.jsp");
	}

}
