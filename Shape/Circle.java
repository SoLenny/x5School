package Shape;

public class Circle {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        @Override
        public double square() {
            return Math.PI * Math.pow(radius, 2);
        }
    }
}
