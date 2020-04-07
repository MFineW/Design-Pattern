package AdapterPattern;

/**
 * @author MFine
 * @version 1.0
 * @ClassName WildTurkey
 * @Description TODO
 * @date 2020/3/24 0:28
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
