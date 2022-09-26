package Spil;

public class Player {

    private int points = 0;
    private String identifier = "";

    // getter
    public int getPoints() {
        return points;
    }
    // setter
    public void setPoints(int newPoints) {
        this.points = newPoints;
    }

    // getter
    public String getIdentifier() {
        return identifier;
    }
    // setter
    public void setIdentifier(String newIdentifier) {
        this.identifier = newIdentifier;
    }
}
