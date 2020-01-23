package lesson8;

public class ShapeDeno {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("df",3, 4, 5);
        shapes[1] = new Circle("sdfs",4, 3, 4);
        shapes[2] = new Rectangl("blue", 8, 9, 2, 43);
        shapes[3] = new Rectangl("braun", 9, 76, 8, 54);
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println(shapes[2].equals(shapes[3]));
        System.out.println(shapes[3]);
    }

}
