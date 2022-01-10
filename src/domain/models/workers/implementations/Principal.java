package domain.models.workers.implementations;

import domain.models.workers.abstractions.Worker;

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

    public String sendReport(String report) {
        return "Received \"" + report + "\" successfully";
    }
}
