package org.example.design_patterns.behavioral.observer;

public interface Observer {
    void update(Weather weather);
    void unregister();
}
