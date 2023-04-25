package neccessary.week03.sec06.exam01;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Human());
        animalList.add(new Eagle());
        animalList.add(new Tiger());

        AnimalTest test = new AnimalTest();
        for (Animal animal : animalList) {
            test.moveAnimal(animal);
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 날아다닙니다.");
    }
}