package first_spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainRunner {
	
	@Autowired
	User u;
	
	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainRunner.class);
		
		MainRunner mr = ac.getBean(MainRunner.class);
		
//		object address returning automatically using Autowired
		
		System.out.println("object address returning automatically using autowiring : "+mr.u);
	}

}
