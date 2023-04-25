package neccessary.week01.sec09;

class StudentSubject {
    String name;
    int subjectID;
    int score;

    StudentSubject(String name, int subjectID, int score) {
        this.name = name;
        this.subjectID = subjectID;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}
