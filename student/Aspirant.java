package student;

public class Aspirant extends Student {
    int averageMark;

    @Override
    int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
