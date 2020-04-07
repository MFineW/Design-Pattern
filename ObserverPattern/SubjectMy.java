package ObserverPattern;

/**
 * Subject
 */
public interface SubjectMy {

    default void registerObserver(Observer O){}
    default void removeObserver(Observer o){}
    default void notifyObservers(){}

}