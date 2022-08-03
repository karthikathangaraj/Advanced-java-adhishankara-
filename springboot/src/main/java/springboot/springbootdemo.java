package springboot;

//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class springbootdemo implements CommandLineRunner{
	public static void main(String[] args)
	{
		SpringApplication.run(springbootdemo.class, args);
	}

	//@Override
	/*public void run(ApplicationArguments args) throws Exception {
		System.out.println("hello spring");
	}*/

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world from Command Line Runner");
		
	}

}
