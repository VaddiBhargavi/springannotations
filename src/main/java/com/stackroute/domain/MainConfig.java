package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
@PropertySource("classpath:Values.properties")
public class MainConfig {


}
