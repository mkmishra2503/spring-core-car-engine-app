package com.springcore.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.engine.Engine;
@Component
public class Car {
	private Engine engine ;
	@Autowired
	public Car( Engine engine) {
		this.engine=engine;
		
	}
	public void drive () {
		engine.start();
		System.out.println("Car is running");
	}
	

}
