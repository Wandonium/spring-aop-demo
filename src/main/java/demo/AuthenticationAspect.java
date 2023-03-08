package demo;

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
public class AuthenticationAspect {
    
    @Pointcut("within(demo..*)")
    public void authenticationPointCut() {
        
    }
    
    @Pointcut("within(demo.ShoppingCart)")
    public void authorizationPointCut() {
        
    }
    
    //@Before("authenticationPointCut() && authorizationPointCut()")
    @Before("authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the request...");
    }
}
