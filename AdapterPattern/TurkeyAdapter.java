package AdapterPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName TurkeyAdapter
 * @Description TODO
 * @date 2020/3/24 0:29
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
