package Shape;

public class Info {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3,4,5);
        shape[1] = new Circle(5);
        shape[2] = new Rectangle(2, 5);
        for (Shape sh : shape) {
            System.out.println("Area square " + sh.square());
        }
    }
}

