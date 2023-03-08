package demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
public class ShoppingCart {
    
    public void checkout() {
        System.out.println("ShoppingCart checkout method called...");
    }
}
