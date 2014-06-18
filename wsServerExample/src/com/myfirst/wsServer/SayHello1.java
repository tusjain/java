package com.myfirst.wsServer;

import javax.jws.WebService;


@WebService
public class SayHello1 {
	
 private static final String SALUTATION = "Hello";

public String getGreeting2( String name ) {
	 
	// return "<Book><name>iRobot</name></book>";
  return SALUTATION + " " + name;
 }


public  String getGreeting3( String name, String myName ) {
	 
		// return "<Book><name>iRobot</name></book>";
	  return SALUTATION + " " + name + "    myName is "+ myName;
	 }

}