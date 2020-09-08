package student;

public class Info {
    public static void main(String[] args) {
        Student student = new Student();
        Student aspirant = new Aspirant();
        student.setAverageMark(4);
        aspirant.setAverageMark(5);
        Student[] students = new Student[]{student, aspirant};
        for (Student i : students) {
            System.out.println(i.getScholarship());
        }
    }

}
