class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        System.out.println(car.brand);
    }
}
