package AdapterPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName MallardDuck
 * @Description TODO
 * @date 2020/3/24 0:27
 **/
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
