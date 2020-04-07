package Factory;

import sun.security.x509.IssuerAlternativeNameExtension;

/**
 * @author MFine
 * @version 1.0
 * @ClassName NYStyleCheesePizza
 * @Description TODO
 * @date 2020/3/16 23:42
 **/
public class NYStyleCheesePizza extends Pizza{

    @Override
    void Prepare() {

    }

    public NYStyleCheesePizza() {


        toppings.add("Grated Reggiano Cheese");
    }
}
