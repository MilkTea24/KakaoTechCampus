package neccessary.week01.sec04;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.studentID = 12345;
        student1.setStudentName("Lee");
        student1.address = "부산";

        Student student2 = new Student();

        student2.studentID = 4321;
        student2.setStudentName("Le");
        student2.address = "부산";

        System.out.println(student1);
    }
}
