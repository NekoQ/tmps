package domain.facades;

import models.students.implementations.Student;
import models.workers.implementations.SecurityGuard;

public class SecurityGuardFacade {
    protected SecurityGuard guard;
    public SecurityGuardFacade(SecurityGuard guard) {
        this.guard = guard;
    }
    public boolean checkStudent(int id, String name, String photo, String address) {
        Student student = guard.studentByID(id);
        boolean nameBool = guard.checkName(student, name);
        boolean photoBool = guard.checkPhoto(student, photo);
        boolean addressBool = guard.checkAddress(student, address);

        return (nameBool && photoBool && addressBool);

    }
}
