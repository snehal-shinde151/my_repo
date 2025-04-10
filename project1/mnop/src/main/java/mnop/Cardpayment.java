package mnop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cardpayment{
	public static void main(String args[]) {
		ApplicationContext app=new ClassPathXmlApplicationContext("Newfile.xml");
		
		Debitcard dc=(Debitcard)app.getBean("pqrs");
		dc.pay();
		Creditcard cc=(Creditcard)app.getBean("strp");
		cc.setX(5);
		System.out.println(cc.getX());
		
		Creditcard c=(Creditcard)app.getBean("strp");
	
		c.getX();
		System.out.println(c.getX());
		
		c.getAddress();
		
	}


}
