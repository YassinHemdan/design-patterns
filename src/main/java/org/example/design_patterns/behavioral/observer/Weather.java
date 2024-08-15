package org.example.design_patterns.behavioral.observer;

public class Weather {
    private float temperature;
    private float pressure;
    private float humidity;

    public Weather() {
        this.temperature = 0;
        this.pressure = 0;
        this.humidity = 0;
    }
    public Weather(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
