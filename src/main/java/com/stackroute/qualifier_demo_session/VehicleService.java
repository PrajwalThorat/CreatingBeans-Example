package com.stackroute.qualifier_demo_session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class VehicleService {
	private Vehicle vehicle;
	
	public void service() {
		vehicle.start();
		vehicle.stop();
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
