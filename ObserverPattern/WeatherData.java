package ObserverPattern;

import java.util.ArrayList;

/**
 * ObserverPattern.WeatherData
 */
public class WeatherData implements SubjectMy {

    private ArrayList<Object> observers;
    private float temperatures;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Object>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperatures, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperatures, float humidity, float pressure) {

        this.temperatures = temperatures;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        
    }

}