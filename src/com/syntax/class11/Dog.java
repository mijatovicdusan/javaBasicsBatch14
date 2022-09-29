package com.syntax.class11;

public class Dog {
	
	 
	String name;
	String color;
	String breed;                     	//state
										//attributes/properties/fields
	double weight;
	int age;
		
	void bark() {
		System.out.println("Barking........");// these are behaviour of a dog,or methods, or functions
	}
	void sleep() {
		
		System.out.println("Dog is sleeping.......");
	}
 public static void main(String[]args) {
	 
	 
	 	Dog dog1=new Dog();// creatinf object from class
	 	dog1.bark();// calling a behaviour on object
	 
	 
	 	dog1.sleep();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
