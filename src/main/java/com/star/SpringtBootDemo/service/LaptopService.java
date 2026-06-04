package com.star.SpringtBootDemo.service;

import com.star.SpringtBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Method called");

    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
