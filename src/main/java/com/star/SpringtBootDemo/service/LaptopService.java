package com.star.SpringtBootDemo.service;

import com.star.SpringtBootDemo.repo.LaptopRepository;
import com.star.SpringtBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("Method called");
          repo.save(lap);

    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
