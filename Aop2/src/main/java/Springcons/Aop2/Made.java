package Springcons.Aop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class Made {
	
	@Before("execution(public boolean display())")
	public void info()
	{
		System.out.println(" thanks to  aspect-j");
	}

}
