package org.example.Test;

import org.springframework.stereotype.Repository;


public class TestDTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestDTO(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
