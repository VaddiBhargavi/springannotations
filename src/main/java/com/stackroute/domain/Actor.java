package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Actor {
    @Value("${actor.Name}")
    private String name;
    @Value("${actor.gender}")
    private String gender;
    @Value("${actor.age}")
    private int age;


  /*  public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void actorDisplayInfo()
    {
        System.out.println("Name=" +name +" "+
                "Gender=" +gender +" "+
                "age=" +age);
    }
}
