package domain.factories.implementations;

import domain.factories.abstractions.ISchoolFactory;
import domain.models.schools.abstarctions.ISchool;
import domain.models.schools.implementations.MiddleSchool;

public class MiddleSchoolFactory implements ISchoolFactory{
    public ISchool create() {
        return new MiddleSchool();
    }
}
