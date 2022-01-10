package domain.factories.implementations;

import domain.factories.abstractions.ISchoolFactory;
import domain.models.schools.abstarctions.ISchool;
import domain.models.schools.implementations.PrimarySchool;

public class PrimarySchoolFactory implements ISchoolFactory {
    public ISchool create() {
        return new PrimarySchool();
    }
}
