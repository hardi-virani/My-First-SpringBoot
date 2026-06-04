package com.star.SpringtBootDemo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    @Autowired
    CPU CPUobj;

    public void compile() {
        CPUobj.run();
        System.out.println("Compiling from laptop");
    }
}
