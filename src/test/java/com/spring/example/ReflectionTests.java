package com.spring.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class ReflectionTests {
    @Test
    void objectCreateAndMethodCall() throws Exception {
        Duck duck = new Duck();
        duck.quack(); //보편적으로 객체를 생성해서 사용하는 방법

        Class<?> duckClass = Class.forName("com.springexample.ReflectionTests$Duck"); //Class.forName 메소드로 클래스 정보를 가져옴
        Object duckObject = duckClass.getDeclaredConstructor().newInstance(); //가져온 클래스 정보에서 생성자를 가져와 객체 생성
        Method quack = duckObject.getClass().getDeclaredMethod("quack", new Class<?>[0]);
        //객체의 클래스 정보에서 메소드를 가져옴.매개변수는 없기 때문에 Class<>[0]으로 매개변수 없다는 것을 표시
        quack.invoke(duckObject);
    }

    static class Duck {
        void quack() {
            System.out.println("꽥꽥");
        }
    }
}
