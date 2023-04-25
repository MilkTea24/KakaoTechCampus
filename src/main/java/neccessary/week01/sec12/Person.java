package neccessary.week01.sec12;

class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
