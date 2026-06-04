package com.star.SpringtBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling from D esktop");
    }

}
