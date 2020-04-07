package Factory;

import sun.security.x509.IssuerAlternativeNameExtension;

/**
 * @author MFine
 * @version 1.0
 * @ClassName CheesePizza
 * @Description TODO
 * @date 2020/2/26 2:16
 **/
public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void Prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
