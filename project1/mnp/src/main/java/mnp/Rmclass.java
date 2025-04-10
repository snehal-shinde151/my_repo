package mnp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rmclass {
	
	@RequestMapping("/hello")
	public Modelclass name() {
		Modelclass m=new Modelclass();
		m.setName("snehal");
		m.setEmail("abc22gmail.com");
		
		return m;
	}
	
	
}
