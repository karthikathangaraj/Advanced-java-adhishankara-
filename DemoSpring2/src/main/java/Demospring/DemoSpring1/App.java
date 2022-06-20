package Demospring.DemoSpring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Car  c1=new Car();
      // Bike b1=new Bike();
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
      // Object c1=ctx.getBean("s1");
    	Vehicle c1=(Vehicle) ctx.getBean("c1");
    	c1.Drive();
       
       
       
    }
}
