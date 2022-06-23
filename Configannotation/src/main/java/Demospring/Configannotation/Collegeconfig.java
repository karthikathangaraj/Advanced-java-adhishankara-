package Demospring.Configannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collegeconfig {
	
	@Bean
	public college collegeBean()
	{
		return new college();
	}

}
