package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 *
 * @author Hillary Wando
 */
@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("before the checkout method in ShoppingCart...");
    }
}
