package ObserverPattern;

/**
 * ObserverPattern.Observer
 */
public interface Observer {

    default void update(float temp, float humidity, float pressure) {
    }
    
}