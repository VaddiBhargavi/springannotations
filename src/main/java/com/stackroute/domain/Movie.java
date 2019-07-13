package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Movie {
    @Autowired
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void movieDisplayInfo()
    {
        System.out.println("Actor details are\n");
        actor.actorDisplayInfo();
    }
}
