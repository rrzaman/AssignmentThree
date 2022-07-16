import java.util.ArrayList;

public class Cell {
    private int strength, x, y, id;

    // Default constructor method
    public Cell() {
        setStrength(0);
        setX(0);
        setY(0);
        setId(0);
    }

    // User-inputted constructor method
    public Cell(int strength, int x, int y, int id) {
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    // interactNeighbours method
    public void interactNeighbours(ArrayList<Cell> neighbors) {

    }

    // Strength setter method
    public void setStrength(int strength) {
        if (strength > 0) {
            this.strength = strength;
        } else {
            this.strength = 0;
        }
    }

    // Strength getter method
    public int getStrength() {
        return this.strength;
    }

    // X-coordinate setter method
    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    // X-coordinate getter method
    public int getX() {
        return this.x;
    }

    // Y-coordinate setter method
    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    // Y-coordinate getter method
    public int getY() {
        return this.y;
    }

    // ID setter method
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    // ID getter method
    public int getId() {
        return this.id;
    }

    // Main method
    public static void main(String[] args) {

    }
}
