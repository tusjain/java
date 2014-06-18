package com.myfirst.wsServer;

import javax.jws.WebService;


@WebService
public class SayHello {
	
 private static final String SALUTATION = "Hello";

public String getGreeting( String name ) {
	 
	// return "<Book><name>iRobot</name></book>";
  return SALUTATION + " " + name;
 }


//public  String getGreeting1( String name, String myName ) {
  String getGreeting1( String name, String myName ) {
	 
		// return "<Book><name>iRobot</name></book>";
	  return SALUTATION + " " + name + "    myName is "+ myName;
	 }

}