package Decorate;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Espresso
 * @Description TODO
 * @date 2020/2/11 2:00
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
