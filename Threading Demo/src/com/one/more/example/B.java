package com.one.more.example;

class B {
	   synchronized void first(A a) {
	      String name = Thread.currentThread().getName();
	      System.out.println(name + " entered B.first");
	      try {
	         Thread.sleep(1000);
	      } catch(Exception e) {
	      }
	      System.out.println(name + " Calling A.second()");
	      a.second();
	   }
	   synchronized void second() {
	      System.out.println("Inside B.second");
	   }
	}