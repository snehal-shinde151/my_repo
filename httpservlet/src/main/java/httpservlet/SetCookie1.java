//retrive cookie

package httpservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class SetCookie1 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		Cookie[] ck=req.getCookies();
	    
		if(ck != null) {
			for(Cookie cookie:ck) {
				res.getWriter().println(cookie.getName() + "=" + cookie.getValue());
			}
		}
		else {
			res.getWriter().println("No cookies found.");		}
	}

}
