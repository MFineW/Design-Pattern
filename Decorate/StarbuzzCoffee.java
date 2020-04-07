package Decorate;

/**
 * @author MFine
 * @version 1.0
 * @ClassName StarbuzzCoffee
 * @Description TODO
 * @date 2020/2/11 2:04
 **/
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
