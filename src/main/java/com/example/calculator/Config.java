package com.example.calculator;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("")
@Component
public class Config extends ResourceConfig{
	public Config() {
		packages("com.example.calculator");
	}
}
