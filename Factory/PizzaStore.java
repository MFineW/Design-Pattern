package Factory;

/**
 * @author MFine
 * @version 1.0
 * @ClassName PizzaStore
 * @Description TODO
 * @date 2020/2/13 21:22
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
