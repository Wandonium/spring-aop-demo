package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Hillary Wando
 * Class to illustrate Aspect Oriented Programming (AOP) in Spring
 * using AspectJ library. We can use AOP for
 * - Logging
 * - Authentication & authorization
 * - Sanitization of data
 * The above are what are referred to as Aspects.
 */
public class SpringAopDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                BeanConfig.class);
        ShoppingCart cart = ctx.getBean(ShoppingCart.class);
        cart.checkout("CANCELED");
    }
}
