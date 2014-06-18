package com.one.more.example;

public class MyObj implements Runnable {
	   A a = new A();
	   B b = new B();
	   MyObj() {
	      //Thread.currentThread().setName("MainThread");
	      Thread t = new Thread(this, "NewThread");
	      t.start();
	      a.first(b); 
	      System.out.println("Back in main thread");
	   }
	   public void run() {
	      b.first(a); 
	      System.out.println("Back in New thread");
	   }
	   public static void main(String args[]) {
	      new MyObj();
	      System.out.println("End of Main Program");
	   }
	}