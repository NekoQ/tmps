package client;

import domain.builders.implementations.ClassRoomBuilder;
import domain.factories.abstractions.ISchoolFactory;
import domain.factories.implementations.PrimarySchoolFactory;
import models.workers.implementations.Principal;
import models.rooms.implementations.ClassRoom;
import models.schools.abstarctions.ISchool;

public class Main {
    public static void main(String[] args) {
        ClassRoomBuilder builder = new ClassRoomBuilder();
        builder.setRoomNumber(25);
        builder.setSeatsNumber(50);
        builder.setSubject("Chemistry");
        builder.addTool("Microscope");
        builder.addTool("Flask");
        ClassRoom room = builder.build();
        System.out.println(room.subject);

        ISchoolFactory factory = new PrimarySchoolFactory();
        ISchool school = factory.create();
        System.out.println(school.getType());

        Principal principal = Principal.getInstance();
        System.out.println(principal.sendReport("test"));
    }
}
