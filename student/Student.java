package student;

public class Student {
   private String firstName;
   private String lastName;
   private String group;
   private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

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
