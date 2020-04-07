package ObserverPattern;


import java.util.Observable;
import java.util.Observer;

/**
 * @author MFine
 * @version 1.0
 * @ClassName WeatherDataOb
 * @Description TODO
 * @date 2020/2/9 23:20
 **/
public class WeatherDataOb extends Observable {

    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherDataOb() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperture,float humidity,float pressure) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperture() {
        return temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
