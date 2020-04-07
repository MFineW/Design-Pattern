package Decorate;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Mocha
 * @Description TODO
 * @date 2020/2/11 2:02
 **/
public class Mocha extends CodimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
