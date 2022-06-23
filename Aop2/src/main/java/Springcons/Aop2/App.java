package Springcons.Aop2;

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
        System.out.println( "Hello World!" );
        ApplicationContext ap1=new AnnotationConfigApplicationContext(Appconfig.class);
        amp a1=ap1.getBean(amp.class);
        a1.display();
        
    }
}
