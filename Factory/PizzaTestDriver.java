package Factory;

import java.util.SortedMap;

/**
 * @author MFine
 * @version 1.0
 * @ClassName PizzaTestDriver
 * @Description TODO
 * @date 2020/3/16 23:48
 **/
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nStore = new NYStylePizzaStore();
        PizzaStore cStore = new ChicagoStylePizzaStore();

        Pizza pizza = nStore.orderPizza("cheese");
        System.out.println("WKQ ordered a" + pizza.getName());

        pizza = cStore.orderPizza("cheese");
        System.out.println("MYF ordered a " + pizza.getName());
    }
}
