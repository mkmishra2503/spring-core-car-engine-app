package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.car.Car;
import com.springcore.config.AppConfig;

public class MainApp {
	public static void main(String[] args ) {
		ApplicationContext a = new AnnotationConfigApplicationContext(AppConfig.class);
		 Car car = a.getBean(Car.class);
		 car.drive();
	}

}
