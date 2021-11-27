package models.actors;

public class Principal {
    private static Principal instance;
    private Principal() {}

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    public String sendReport(String report) {
        return "Received \"" + report + "\" successfully";
    }

}
