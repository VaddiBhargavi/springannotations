package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyer");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialiser");
    }
    public void customInit()
    {
        System.out.println("Initialise bean");
    }
    public void customDestroy()
    {
        System.out.println("Destroy bean");
    }
}
