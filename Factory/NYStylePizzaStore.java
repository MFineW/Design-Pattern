package Factory;

/**
 * @author MFine
 * @version 1.0
 * @ClassName NYStylePizzaStore
 * @Description TODO
 * @date 2020/2/14 2:13
 **/
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepproniPizza();
        }
        return pizza;
    }
}
