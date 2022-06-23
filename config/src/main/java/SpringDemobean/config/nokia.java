package SpringDemobean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringDemobean.config")
public class nokia {
	
	public void config()
	{
		System.out.println("cofig of nokia 1100");
	}

}
