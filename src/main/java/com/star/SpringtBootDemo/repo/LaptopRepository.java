package com.star.SpringtBootDemo.repo;

import com.star.SpringtBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
//This class is reponisible to connect with database
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in DataBase");
    }
}
