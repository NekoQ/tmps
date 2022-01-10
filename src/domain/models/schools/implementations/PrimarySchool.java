package domain.models.schools.implementations;

import domain.models.schools.abstarctions.ISchool;

public class PrimarySchool implements ISchool {
    public String getType() {
        return "Primary";
    }
}
