package com.java.usecase;

class Trial{
	void print() {
		System.out.println(this);
	}
}

public class Demo1 {


	public static void main(String[] args) {
		Trial t = new Trial();
		Trial t1 = new Trial();
		System.out.println(t);
		System.out.println(t1);
		t1.print();
		
		// TODO Auto-generated method stub

	}

}
