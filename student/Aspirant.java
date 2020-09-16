package student;

public class Aspirant extends Student {
   private int averageMark;

    public Aspirant(String firstName, String lastName, String group, double averageMark, int averageMark1) {
        super(firstName, lastName, group, averageMark);
        this.averageMark = averageMark1;
    }

    @Override
    int getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
