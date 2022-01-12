package domain.factories.implementations;

import domain.factories.abstractions.ISchoolFactory;
import models.schools.abstarctions.ISchool;
import models.schools.implementations.MiddleSchool;

public class MiddleSchoolFactory implements ISchoolFactory{
    public ISchool create() {
        return new MiddleSchool();
    }
}
