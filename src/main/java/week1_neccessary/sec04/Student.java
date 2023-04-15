package week1_neccessary.sec04;

class Student {
    int studentID;
    String studentName;
    String address;

    void showStudentInfo() {
        System.out.println(studentID + "학번의 이름은 " + studentName + ", 주소는 " + address + "입니다.");
    }

    String getStudentName() {
        return studentName;
    }

    void setStudentName(String name) {
        studentName = name;
    }
}
