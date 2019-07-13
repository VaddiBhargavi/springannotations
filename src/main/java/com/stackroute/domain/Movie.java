package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
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

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanfactory is=" +beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("beanname is=" +beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("Applicationcontext =" +context);
    }
}
