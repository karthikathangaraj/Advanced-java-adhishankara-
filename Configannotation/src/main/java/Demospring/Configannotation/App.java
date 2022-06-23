package Demospring.Configannotation;

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
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Collegeconfig.class);
        college c1 =ctx.getBean("collegeBean",college.class);
        c1.test();
    }
}
