package com.code2bits.opensort.bugs;

import java.sql.Connection;
import java.sql.DriverManager;

class A {
	
	  private static int count = 0;

	  public void doSomething() {
	    //...
	    count++;  // Noncompliant
	  }
	
	  private void method() throws Exception {
		  Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "AppLogin", "");
		  Connection conn2 = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true?user=user&password=");
	  }
	  
	  private int x;
	  private int y;

	  public void setX(int val) { // Noncompliant: field 'x' is not updated
	    this.y = val;
	  }

	  public int getY() { // Noncompliant: field 'y' is not used in the return value
	    return this.x;
	  }
	  
	  
	  void test_divide() {
		  int z = 0;
		  if (Math.random() < 0.5) {

		    z = 3;
		  } else {

		  }
		  
		  if (x < 0)
			  new IllegalArgumentException("x must be nonnegative");
		  
		  z = 1 / z; // Noncompliant, possible division by zero
		}
	  
	  
	  String name;
	  int age;

	  public synchronized void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {  // Noncompliant
	    return this.name;
	  }

	  public void setAge(int age) {  // Noncompliant
	    this.age = age;
	  }
	  
	  public int getAge() {
	    synchronized (this) {
	      return this.age;
	    }
	  }




}
