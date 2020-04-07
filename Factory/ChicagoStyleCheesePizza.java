package Factory;

/**
 * @author MFine
 * @version 1.0
 * @ClassName ChicagoStyleCheesePizza
 * @Description TODO
 * @date 2020/2/14 2:29
 **/
public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    void Prepare() {

    }

    public ChicagoStyleCheesePizza() {

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.print("Cutting the pizza into square slices");
    }
}
