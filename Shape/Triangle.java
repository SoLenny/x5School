package Shape;

public class Triangle implements Shape {
    int OneSide;
    int TwoSide;
    int ThreeSide;

    public Triangle(int OneSide, int TwoSide, int ThreeSide) {
        this.OneSide = OneSide;
        this.TwoSide = TwoSide;
        this.ThreeSide = ThreeSide;
    }

    @Override
    double square(){
        double square = Math.sqrt(getSemiPerimeter()
                * (getSemiPerimeter() - OneSide)
                * (getSemiPerimeter() - TwoSide)
                * (getSemiPerimeter() - ThreeSide));
        if (Double.isNaN(square)) {
            try {
                throw new Exception("Such triangle doesn't exist");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return square;
    }

    double getSemiPerimeter() {
        return (OneSide + TwoSide + ThreeSide) / 2.0;
    }
}
