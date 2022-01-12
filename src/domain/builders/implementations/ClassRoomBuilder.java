package domain.builders.implementations;

import domain.builders.abstractions.IRoomBuilder;
import models.rooms.implementations.ClassRoom;

public class ClassRoomBuilder implements IRoomBuilder {
    private ClassRoom room;

    public ClassRoomBuilder() {
        this.reset();
    }

    public void reset() {
        room = new ClassRoom();
    }

    public void setRoomNumber(int number) {
        room.number = number;
    }

    public void setSeatsNumber(int number) {
        room.seatsNumber = number;
    }

    public void setSubject(String subject) {
        room.subject = subject;
    }

    public void addTool(String tool) {
        room.tools.add(tool);
    }

    public ClassRoom build() {
        ClassRoom result = room;
        this.reset();
        return result;
    }
}
