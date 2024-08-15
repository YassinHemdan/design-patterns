package org.example.design_patterns.behavioral.observer;

public class CurrentWeatherDisplayService implements DisplayService, Observer{
    private final Subject subject;
    private Weather weather;
    public CurrentWeatherDisplayService(Subject subject){
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void display() {
        if(weather == null)
            return;

        // display logic
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }

    @Override
    public void unregister() {
        subject.unregister(this);
    }

}
