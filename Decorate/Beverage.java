package Decorate;

/**
 * @author MFine
 * @version 1.0
 * @ClassName Beverage
 * @Description TODO
 * @date 2020/2/11 1:57
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
