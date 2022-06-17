package com.Springs.ConstructorInjection;

public class Addition {
	private int a;
	private int b;
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//ambiguity of calling the constructor : put type in xml class
	public Addition(int a, int b) {
	
		this.a = a;
		this.b = b;
		System.out.println("Constructor int : int");
	}
	
	public Addition(double a, double b) {
		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor double : double");
	}
   public Addition(String a,  String b) {
		
		this.a = Integer.parseInt(a);
		this.b =  Integer.parseInt(b);
		System.out.println("Constructor String  : string");
	}
	
	public void doSum() {
		System.out.println("Vlaue of a :" +this.a);
		System.out.println("Vlaue of b :" +this.b);
		System.out.println("Sum is :  " +(this.a + this.b));
	}

}
