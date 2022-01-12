package models.workers.implementations;

import models.workers.abstractions.Worker;

public class Secretary extends Worker {
    public void notify(String event) {
        System.out.println("Secretary notified");
    }
}
