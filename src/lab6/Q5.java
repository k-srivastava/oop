package lab6;

abstract class Figure {
    public double x;
    public double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}

class Triangle extends Figure {
    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0.5 * x * y;
    }
}

class Rectangle extends Figure {
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return x * y;
    }
}

class Square extends Figure {
    public Square(double x) {
        super(x, x);
    }

    @Override
    public double area() {
        return x * x;
    }
}

public class Q5 { }
