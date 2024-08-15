package org.example.design_patterns.behavioral.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private final Weather weather;
    private final ArrayList<Observer> observers;

    public WeatherData(){
        weather = new Weather();
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(this.getWeather());
    }

    // somehow this method is called whenever a change in the data occur
    public void measurementsChanged(){
        notifyObservers();
    }

    public Weather getWeather(){
        return this.weather;
    }
}
