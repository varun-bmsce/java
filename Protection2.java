//This is file Protection2.java
package p2;

import p1.Protection;

public class Protection2 extends Protection {
  public Protection2() {
	//p1 p=new p1();
	System.out.println("derived other package constructor");
	//  class or package only
	//  System.out.println("n = " + n);
	//  class only
	  //System.out.println("n_pri = " + n_pri);

	System.out.println("n_pro = " + n_pro);
	System.out.println("n_pub = " + n_pub);
  }   
}

