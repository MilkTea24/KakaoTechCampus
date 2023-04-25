package neccessary.week01.sec06;

class Student {
    int studentNumber;
    String studentName;
    int grade;

    Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    String showStudentInfo() {
        return studentName + ". " + studentName + ". " + grade;
    }

}
