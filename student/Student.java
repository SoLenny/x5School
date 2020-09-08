package student;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    int getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
