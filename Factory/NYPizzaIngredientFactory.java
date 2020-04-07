package Factory;

/**
 * @author MFine
 * @version 1.0
 * @ClassName NYPizzaIngredientFactory
 * @Description TODO
 * @date 2020/3/17 1:06
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new ReggianSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion()};
    }

    @Override
    public Pepperoni createPepproni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }
}
