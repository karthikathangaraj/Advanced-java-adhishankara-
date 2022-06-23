package SpringDemobean.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class configjava {
	@Bean
	public nokia getphone()
	{
		return new nokia();
		
	}

}
