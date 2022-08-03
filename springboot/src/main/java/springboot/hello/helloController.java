package springboot.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class helloController {
	@RequestMapping("/springboot.hello")
	public String sayhi()
	{
		return "hi karthika good evening";
	}
	

}
