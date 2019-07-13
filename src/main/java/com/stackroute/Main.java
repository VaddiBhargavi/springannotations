package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Movie movie3 = context.getBean( Movie.class);
        movie3.movieDisplayInfo();
        Movie movie2 = context.getBean( Movie.class);
       // movie2.movieDisplayInfo();
        System.out.println(movie3==movie2);


    }
}
