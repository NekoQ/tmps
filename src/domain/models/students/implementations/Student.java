package domain.models.students.implementations;

import domain.models.students.abstractions.IStudent;

public class Student implements IStudent {

    @Override
    public int getID() {
        return 0;
    }

    public String getName() {
        return "";
    }
    @Override
    public int getPhoto() {
        return 0;
    }

    @Override
    public String getAddress() {
        return "";
    }
}
