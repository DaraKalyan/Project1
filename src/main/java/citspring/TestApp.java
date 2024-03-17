package citspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		HelloWorld hw=(HelloWorld)ctx.getBean("helloWorld");
		System.out.println(hw.getMessage());
	
		
	}

}
