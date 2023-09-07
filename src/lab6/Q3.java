package lab6;

import java.time.LocalDate;
import java.time.Year;

class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String name() { return name; }

    public void setName(String name) { this.name = name; }

    public LocalDate birthDate() { return birthDate; }

    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
}

class CollegeGraduate extends Person {
    private float gpa;
    private Year graduationYear;

    public CollegeGraduate(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public float gpa() { return gpa; }

    public void setGpa(float gpa) { this.gpa = gpa; }

    public Year graduationYear() { return graduationYear; }

    public void setGraduationYear(Year graduationYear) { this.graduationYear = graduationYear; }
}

public class Q3 { }
