package com.stackroute.domain;

import org.springframework.stereotype.Component;

public class Movie {
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
