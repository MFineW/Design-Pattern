package StratePattern;

/**
 * StratePattern.Squack
 */
public class Squack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}