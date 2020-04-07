package ObserverPattern;

import com.sun.org.glassfish.external.statistics.Statistic;

public class WeatherStation {
    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
//
//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 67, 32.4f);
//        weatherData.setMeasurements(84, 69, 34.4f);

        WeatherDataOb weatherDataOb = new WeatherDataOb();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataOb);

        weatherDataOb.setMeasurements(80, 65, 30.4f);
        weatherDataOb.setMeasurements(82, 67, 32.4f);
        weatherDataOb.setMeasurements(84, 69, 34.4f);
    }
}
