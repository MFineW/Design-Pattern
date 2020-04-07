package Decorate;

/**
 * @author MFine
 * @version 1.0
 * @ClassName HouseBlend
 * @Description TODO
 * @date 2020/2/11 2:01
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
