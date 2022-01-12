package models.schools.implementations;

import models.schools.abstarctions.ISchool;

public class PrimarySchool implements ISchool {
    public String getType() {
        return "Primary";
    }
}
