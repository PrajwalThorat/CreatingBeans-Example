package com.stackroute.qualifier_demo_session;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Bike implements Vehicle{

	public void start() {
		System.out.println("Bike started");
	}

	public void stop() {
		System.out.println("Bike Stopped");
	}

}
