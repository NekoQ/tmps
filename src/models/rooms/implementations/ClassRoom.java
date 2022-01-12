package models.rooms.implementations;

import models.rooms.abstractions.IRoom;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements IRoom {
    public int number;
    public String subject;
    public int seatsNumber;
    public String teacher;
    public List<String> tools = new ArrayList<>();
    public String getType() {
        return "Class";
    }

}
