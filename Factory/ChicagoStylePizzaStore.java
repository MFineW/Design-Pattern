package Factory;

/**
 * @author MFine
 * @version 1.0
 * @ClassName ChicagoStylePizzaStore
 * @Description TODO
 * @date 2020/2/14 2:28
 **/
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
