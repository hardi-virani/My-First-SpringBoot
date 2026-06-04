package com.star.SpringtBootDemo;

import com.star.SpringtBootDemo.model.Laptop;
import com.star.SpringtBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringtBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringtBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alein obj = context.getBean(Alein.class);
//		obj.code();
//		System.out.println(obj.getAge());





	}

}
