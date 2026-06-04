package com.star.SpringtBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alein {

    @Value("25")
    private int age;
    private Computer com;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Computer getCom() {
        return com;
    }

    @Autowired
//    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() { //Method
        com.compile();
    }
}

// Now in this case Alien and Laptop is not connected. Because when we use the laptop class object in main class it will show the output ("compiling") because we have use the component so we have a direct access to the container, but when we create the alein obj in main class, the container cannot find the (laptop class)obj through alein class in container. Which means the Alein is not connected with the Laptop (because somehow Alein is dependent on Laptop class)

// Because we have not mention in the Alein class that we need the Alein obj to be coming from the Laptop class. (By default the spring won't do anything by itself for us.)

// To do this, we have a concept called wiring(we will get to know this when we start learning spring framework). But just by using @Autowired we will get the laptop obj from the laptop class in Alein class and in main class we will get the laptop obj through Alein class.