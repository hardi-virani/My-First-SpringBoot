package com.star.SpringtBootDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    CPU CPUobj;

    public void compile() {
        CPUobj.run();
    }
}
