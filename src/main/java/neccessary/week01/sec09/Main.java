package neccessary.week01.sec09;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Kim", 3);
        student.setStudentSubject("math", 1, 93);
        student.setStudentSubject("english", 2, 98);
        System.out.println(student.getStudentSubject());
    }
}
