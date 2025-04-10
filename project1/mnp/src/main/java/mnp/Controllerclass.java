package mnp;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Controllerclass {
	
	@ExceptionHandler(value=Exception.class)
	public String Hello() {
		return "error";
	}

}
