package com.spring.example.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.util.Date;

public class NowTimeModel {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") //스프링에서 지원하는 사용자 정의 어노테이션
    private Date currentDateTime;

    public NowTimeModel(String name) {
        if (StringUtils.hasText(name)) { //스프링에서 지원하는 StringUtils 사용
            this.name = name;
        }
        else {
            this.name = "Default";
        }
        this.currentDateTime = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getCurrentDateTime() {
        return currentDateTime;
    }
}
