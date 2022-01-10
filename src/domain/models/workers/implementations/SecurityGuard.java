package domain.models.workers.implementations;

import domain.models.students.implementations.Student;
import domain.models.workers.abstractions.Worker;

public class SecurityGuard extends Worker {
    public int salary = 200;

    public Student studentByID(int ID) {
        Student student = new Student();
        return student;
    }

    public boolean checkName(Student student, String name) {
        return true;
    }

    public boolean checkPhoto(Student student, String photo) {
        return true;
    }
    public boolean checkAddress(Student student, String address) {
        return true;
    }
}
