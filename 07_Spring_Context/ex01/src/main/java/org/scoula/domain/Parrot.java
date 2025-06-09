package org.scoula.domain;

import org.springframework.stereotype.Component;

//Component 어노테이션에서는 클래스명이 이름이 된다 .
@Component
public class Parrot {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
