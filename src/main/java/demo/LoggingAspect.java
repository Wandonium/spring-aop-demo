package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 *
 * @author Hillary Wando
 */
@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void beforeLogger() {
        System.out.println("before the checkout method in ShoppingCart...");
    }
    
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLoggerWithParam(JoinPoint jp) {
        String args = jp.getArgs()[0].toString();
        System.out.println("checkout method argument: " + args);
        System.out.println("before the checkout method with params in ShoppingCart...");
    }
    
    @After("execution(* *.*.checkout())")
    public void afterLogger() {
        System.out.println("after the checkout method in ShoppingCart...");
    }
    
    @After("execution(* *.*.checkout(..))")
    public void afterLoggerWithParam() {
        System.out.println("after the checkout method with params in ShoppingCart...");
    }
    
    @Pointcut("execution(* demo.ShoppingCart.quantity())")
    public void afterReturningPointcut() {}
    
    @AfterReturning(pointcut = "afterReturningPointcut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After returning..." + retVal);
    }
}
