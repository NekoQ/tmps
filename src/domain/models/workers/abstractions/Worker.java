package domain.models.workers.abstractions;

public abstract class Worker implements IWorker{
    protected int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
