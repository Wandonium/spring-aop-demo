package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Hillary Wando
 */
public class SpringAopDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                BeanConfig.class);
        ShoppingCart cart = ctx.getBean(ShoppingCart.class);
        cart.checkout();
    }
}
