package domain.decorator;

import domain.models.workers.abstractions.Worker;
import domain.models.workers.implementations.Staff;

public class StaffDecorator extends Staff {
    public StaffDecorator(Staff staff) {
        super();
    }

    public void decreaseSalary(int percent) {
        for (Worker worker: workers) {
            worker.setSalary(worker.getSalary() * percent / 100);
        }
    }
}
