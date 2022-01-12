package models.workers.implementations;

import domain.observers.EventManager;
import models.workers.abstractions.Worker;

import java.util.ArrayList;

public class Principal extends Worker {
    public int salary = 500;
    private static Principal instance;
    private Principal() {}

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }


    public EventManager events;

    public String sendReport(String report) {
        events.notify(report);
        return "Sent \"" + report + "\" successfully";
    }
}
