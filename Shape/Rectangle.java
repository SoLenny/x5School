package Shape;

public class Rectangle implements Shape {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double square() {
        return height * width;
    }
}

