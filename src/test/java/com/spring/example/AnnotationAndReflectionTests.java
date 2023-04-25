package com.spring.example;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationAndReflectionTests {
    @Test
    void handleAnnotation() throws Exception {
        Class<BlogService> blogServiceClass = BlogService.class;
        Component component = blogServiceClass.getAnnotation(Component.class);

        System.out.println(component.name());
    }

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface Component { //Component라고 하는 커스텀 어노테이션 하나를 작성
        String name(); //Component 어노테이션이 가질 수 있는 속성
    }

    @Component(name = "블로그 서비스")
    class BlogService {

    }
}
