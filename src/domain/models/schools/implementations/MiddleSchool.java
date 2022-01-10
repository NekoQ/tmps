package domain.models.schools.implementations;

import domain.models.schools.abstarctions.ISchool;

public class MiddleSchool implements ISchool {
    public String getType() {
        return "Middle";
    }
}
