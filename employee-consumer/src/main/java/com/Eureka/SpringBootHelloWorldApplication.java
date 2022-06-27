package com.Eureka;

import java.io.IOException;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.Eureka.controll.ConsumerControllerClient;
//import com.netflix.discovery.shared.Application;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		//ApplicationContext ctx =  (ApplicationContext) SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		 //SpringApplication application = new SpringApplication(SpringBootHelloWorldApplication.class);
		 //SpringApplication.run(Application.class, args);
		//ApplicationContext ctx = (ApplicationContext) SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		//ConsumerControllerClient consumerControllerClient=((BeanFactory) ctx).getBean(ConsumerControllerClient.class);
		//System.out.println(consumerControllerClient);
		//consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}