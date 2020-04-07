package StratePattern;

/**
 * StratePattern.Quack
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("StratePattern.Quack");
    }

}