package head.first.pattern.observer;

import head.first.pattern.observer.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {


    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + ", " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
