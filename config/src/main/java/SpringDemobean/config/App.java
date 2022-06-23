package SpringDemobean.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(configjava.class);
        nokia  c1=(nokia) ctx.getBean(nokia.class);
        System.out.println(c1);
        c1.config();
    }
}
