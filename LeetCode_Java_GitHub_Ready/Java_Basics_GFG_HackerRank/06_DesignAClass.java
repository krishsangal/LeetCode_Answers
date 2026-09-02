class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class DesignAClass {
    public static void main(String[] args) {
        Student student = new Student("Krish", 20);
        student.display();
    }
}
