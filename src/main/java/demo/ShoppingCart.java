package demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
public class ShoppingCart {
    
    public void checkout(String status) {
        System.out.println("ShoppingCart checkout method called...");
    }
}
