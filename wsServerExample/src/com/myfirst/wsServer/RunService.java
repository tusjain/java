package com.myfirst.wsServer;

import javax.xml.ws.Endpoint;

public class RunService {
	public static void main(String[] args) {
		
	  System.out.println("SayHello Web Service started.");
	  Endpoint.publish("http://localhost:8080/wsServerExample", new SayHello());

	}
}