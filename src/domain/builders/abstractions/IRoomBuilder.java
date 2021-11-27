package domain.builders.abstractions;

public interface IRoomBuilder {
    void setRoomNumber(int number);
    void setSeatsNumber(int number);
    void setSubject(String subject);
    void addTool(String tool);
}
