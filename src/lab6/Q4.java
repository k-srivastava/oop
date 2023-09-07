package lab6;

enum Grade {
    Elementary, Middle, High
}

class Building {
    public float floorArea;
    public int numStories;

    public Building(float floorArea) {
        this.floorArea = floorArea;
    }
}

class House extends Building {
    public int bhk;

    public House(float floorArea, int bhk) {
        super(floorArea);
        this.bhk = bhk;
    }
}

class School extends Building {
    public int numClassRooms;
    public Grade grade;

    public School(float floorArea, int numClassRooms, Grade grade) {
        super(floorArea);
        this.numClassRooms = numClassRooms;
        this.grade = grade;
    }
}

public class Q4 { }
