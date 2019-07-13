package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Values.properties")
public class MainConfig {
@Bean
    public Movie movie1()
    {
        Movie movie= new Movie();
      movie.setActor(actor());
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
