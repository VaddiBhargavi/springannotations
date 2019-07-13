package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:Values.properties")
public class MainConfig {
@Bean
@Scope("prototype")
    public Movie movie1()
    {
        Movie movie= new Movie(actor());
       // movie.movieDisplayInfo();
        return movie;
}
@Bean
public Actor actor()
{
    Actor actor = new Actor();
    return actor;
}
}
