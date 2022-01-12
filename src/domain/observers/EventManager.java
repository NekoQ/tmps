package domain.observers;

import models.workers.abstractions.Worker;
import models.workers.implementations.Secretary;

import java.util.ArrayList;

public class EventManager {
    ArrayList<Secretary> listeners = new ArrayList<>();

    public void subscribe(Secretary secretary) {
        listeners.add(secretary);
    }

    public void unsubscribe(Secretary secretary) {
        listeners.remove(secretary);
    }

    public void notify(String report) {
        for (Secretary secretary: listeners) {
            secretary.notify(report);
        }
    }
}
