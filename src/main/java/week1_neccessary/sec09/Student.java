package week1_neccessary.sec09;

class Student {
    int studentID;
    String studentName;
    StudentSubject[] subjects;
    private int subjectInd;

    Student(int studentID, String studentName, int subjectNumber) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new StudentSubject[subjectNumber];
        subjectInd = 0;
    }

    void setStudentSubject(String subjectName, int subjectId, int score) {
        if (subjectInd < subjects.length) subjects[subjectInd++] = new StudentSubject(subjectName, subjectId, score);
    }

    String getStudentSubject() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subjectInd; i++) {
            sb.append(subjects[i] + "\n");
        }
        return sb.toString();
    }
}
