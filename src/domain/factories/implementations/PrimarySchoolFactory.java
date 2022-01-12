package domain.factories.implementations;

import domain.factories.abstractions.ISchoolFactory;
import models.schools.abstarctions.ISchool;
import models.schools.implementations.PrimarySchool;

public class PrimarySchoolFactory implements ISchoolFactory {
    public ISchool create() {
        return new PrimarySchool();
    }
}
