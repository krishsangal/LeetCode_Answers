class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
