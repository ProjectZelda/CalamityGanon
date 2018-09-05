package com.code2bits.opensort.bugs;

class A {
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
		  z = 1 / z; // Noncompliant, possible division by zero
		}
}
