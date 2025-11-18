package com.java.usage;
class Animal{
	String color="Black";
	
	
}
class Dog extends Animal{
	String color="White";
	void print() {
		System.out.println(super.color);
	}
	void eat() {
		System.out.println("Eating Bread");
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d = new Dog();
        System.out.println(d.color);
        d.print();
        d.eat();
	}

}
