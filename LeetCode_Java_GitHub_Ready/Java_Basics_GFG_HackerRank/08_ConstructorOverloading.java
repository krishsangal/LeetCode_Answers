class Box {
    int length, width, height;

    Box() {
        this(1, 1, 1);
    }

    Box(int side) {
        this(side, side, side);
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box box = new Box(2, 3, 4);
        System.out.println(box.length * box.width * box.height);
    }
}
