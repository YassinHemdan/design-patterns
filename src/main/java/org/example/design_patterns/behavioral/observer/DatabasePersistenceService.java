package org.example.design_patterns.behavioral.observer;

public class DatabasePersistenceService implements PersistenceService, Observer{
    private final Subject subject;
    private Weather weather;

    public DatabasePersistenceService(Subject subject){
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void update(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void unregister() {
        subject.unregister(this);
    }

    @Override
    public void save() {
        if(weather == null)
            return;

        // persistence logic
    }
}
