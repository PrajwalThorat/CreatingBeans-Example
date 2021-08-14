package com.stackroute.qualifier_demo_session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.qualifier_demo_Session")

public class AppConfig {
	
	@Bean
	//bikeBean
	public Bike bikeBean() {
		return new Bike();
	}
	
	@Bean
	//carBean
	public Car carBean() {
		return new Car();
	}
	
	@Bean
	//getVehicleService
	public VehicleService getVehcileService(@Autowired @Qualifier("carBean") Vehicle vehicle) {
		VehicleService service=new VehicleService();
		service.setVehicle(vehicle);
		return service;
		
	}
}
