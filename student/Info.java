package student;

public class Info {
    public static void main(String[] args) {
        Student student = new Student("Mary", "Sutter", "first", 5);
        Student aspirant = new Aspirant("Gvan", "Loff", "third",5);
        student.setAverageMark(4);
        aspirant.setAverageMark(5);
        Student[] students = new Student[]{student, aspirant};
        for (Student i : students) {
            System.out.println(i.getScholarship());
        }
    }

}
