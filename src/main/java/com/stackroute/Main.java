package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Movie movie3 = context.getBean( Movie.class);
        movie3.movieDisplayInfo();
        context.registerShutdownHook();
    }
}
