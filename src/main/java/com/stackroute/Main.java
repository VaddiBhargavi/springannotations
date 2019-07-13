package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Movie movie = context.getBean("movie1", Movie.class);
        movie.movieDisplayInfo();
       /* BeanFactory factory= new Annotation(MainConfig.class);
        System.out.println("---Using BeanDefinitionRegistry and BeanDefinitionReader---");
        DefaultListableBeanFactory factory1 = new DefaultListableBeanFactory();
        AnnotatedBeanDefinitionReader register = new AnnotatedBeanDefinitionReader(factory1);
        AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(register);
        reader.getBeanClassLoader(MainConfig.class);*/

    }
}
