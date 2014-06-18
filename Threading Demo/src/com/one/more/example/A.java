package com.one.more.example;
class A {
	   synchronized void first(B b) {
	      String name = Thread.currentThread().getName();
	      System.out.println(name + " Inside A.first"); 
	      try {
	         Thread.sleep(1000);
	      } catch(Exception e) { }
	      System.out.println(name + " calling B.second()");
	      b.second();
	   }
	   synchronized void second() {
	      System.out.println("Inside A.second");
	   }
	}