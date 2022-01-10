package domain.models.workers.implementations;

import domain.models.workers.abstractions.Worker;

import java.util.ArrayList;
import java.util.List;

public class Staff extends Worker {
    protected List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public int getSalary() {
        int salary = 0;
        for (Worker worker : workers) {
            salary += worker.getSalary();
        }
        return salary;
    }
}
