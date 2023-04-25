package neccessary.week01.sec14;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Person("James", 5000, 17, SpecialFare.NONE);
        persons[1] = new Person("Tomas", 10000, 35, SpecialFare.NONE);

        Subway subway = new Subway("green");
        Bus bus = new Bus("100");

        persons[0].takeTransit(subway);
        persons[1].takeTransit(bus);
    }
}
