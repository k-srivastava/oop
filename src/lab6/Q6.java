package lab6;

class CustomStudent {
    public String name;
    public int id;

    public CustomStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class SportsStudent extends CustomStudent {
    public float grade;

    public SportsStudent(String name, int id, float grade) {
        super(name, id);
        this.grade = grade;
    }
}

class ExamStudent extends CustomStudent {
    public float grade;

    public ExamStudent(String name, int id, float grade) {
        super(name, id);
        this.grade = grade;
    }
}

public class Q6 {
}
