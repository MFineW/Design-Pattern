package ObserverPattern;


import java.util.Observable;
import java.util.Observer;

/**
 * @author MFine
 * @version 1.0
 * @ClassName CurrentConditionsDisplay
 * @Description TODO
 * @date 2020/2/9 23:27
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humdity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataOb) {
            WeatherDataOb weatherDataOb = (WeatherDataOb) o;
            this.temperature = weatherDataOb.getTemperture();
            this.humdity = weatherDataOb.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humdity + "% humidity");
    }
}
