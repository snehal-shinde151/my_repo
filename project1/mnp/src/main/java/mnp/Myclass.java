package mnp;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class Myclass {
	
	@RequestMapping("/view")
	public String sarve(@RequestParam("name") String s,Model m)
	{
		m.addAttribute("pqr","hii");
	System.out.println(s);	
	return "index1";
	}

	@RequestMapping(path="/ind",method=RequestMethod.POST)
     public String Hello(@ModelAttribute("user") Modelclass user,Model m) {
		
		m.addAttribute("user",user);
		return "ind1";
	
		
	}
	
	@RequestMapping(path="/spr")
	public void Exc() {
		int a=10,b=0;
		int s=a/b;
		
	}
	@ExceptionHandler(value=Exception.class) 
     public String Exc1() {
		return "error";
	}
}
