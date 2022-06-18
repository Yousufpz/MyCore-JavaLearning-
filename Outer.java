package javaL;

public class Outer {
	static void f1() {
		System.out.println("in outer static methord f1 ");
	}
	
	static class Inner{
		static void f2() {
			System.out.println("in inner static methord f2 ");
		}
		
	    void f3() {
			System.out.println("in inner non static  methord f3 ");
		}
	}
	
	public static void main(String[] args) {
		Outer.f1();
		Inner.f2();
		Outer.Inner inner = new Inner();
		inner.f3();
	}
}
