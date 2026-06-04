package com.star.SpringtBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling from D esktop");
    }

}
