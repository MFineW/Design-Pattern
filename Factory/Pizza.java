package Factory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Pizza
 * @Description TODO
 * @date 2020/2/13 21:00
 **/
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies vieggie[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    abstract void Prepare();

    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", vieggie=" + Arrays.toString(vieggie) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                ", toppings=" + toppings +
                '}';
    }
}
