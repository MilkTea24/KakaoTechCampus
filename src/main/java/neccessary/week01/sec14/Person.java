package neccessary.week01.sec14;

class Person {
    private String name;
    private int money;
    private int old;
    private SpecialFare specialFare;

    Person(String name, int money, int old, SpecialFare specialFare) {
        this.name = name;
        this.money = Math.max(money, 0);
        this.old = old;
        this.specialFare = specialFare;
    }

    public void takeTransit(Transit transit) {
        int myFare = 0;
        myFare = transit.getFare(specialFare, old);
        money -= myFare;
        transit.earnFare(myFare);

        System.out.println(name + "님은 " + transit + "을 이용하여 요금이 " + myFare + "원 차감되었습니다.");
        System.out.println("남은 돈은 " + money + "원");
    }

    @Override
    public String toString() {
        return name + " " + money + "원";
    }
}
