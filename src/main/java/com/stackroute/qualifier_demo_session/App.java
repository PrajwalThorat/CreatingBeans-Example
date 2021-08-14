package com.stackroute.qualifier_demo_session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	VehicleService vehicleService=(VehicleService)context.getBean("getVehcileService");
    	vehicleService.service();
    }
}
