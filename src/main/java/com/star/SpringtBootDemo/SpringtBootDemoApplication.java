package com.star.SpringtBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringtBootDemoApplication {

	public static void main(String[] args) {
		//		Alein obj = new Alein(); // Now i dont want myslef of create the obj, i want spring to create it. (Basically no 'new' keyword)
		//		obj.code();


		ApplicationContext context = SpringApplication.run(SpringtBootDemoApplication.class, args);
//		ApplicationContext context <- (run) will return this context(obj) , which eventually means we have a way to communicate with our container.


		//How we will communicate with or container.
		Alein obj = context.getBean(Alein.class); // Now our IOC will only give the obj if it will be in the container. (we are just assuming that the obj is present in the container).
		obj.code();

		// Let try and create another object.
		// Even though it is giving us the output we want, but the question is are we getting the same obj (from the IOc container)? --> We will learn this when we will get to know the spring framwork
//		Alein obj1 = context.getBean(Alein.class);
//		obj1.code();


//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();

//		CPU cpu = context.getBean(CPU.class);
//		cpu.run();





	}

}
