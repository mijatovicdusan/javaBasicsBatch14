package com.syntax.class11;

public class DogHomework {

	//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.

	String breed;
	String color;
	String size;
	int weight;
	int numberOfLegs;
	
	void bark() {
		System.out.println("bark");
	}
	void sleep() {
		System.out.println("like to sleep");
	}
	void run() {
		System.out.println("like to run");
	}
	
	public static void main(String[] args) {
		
		DogHomework Husky=new DogHomework();
		
		Husky.breed="husky";
		Husky.size="large";
		Husky.weight=90;
		
		System.out.println("My dog is "+Husky.breed+" and he is "+Husky.size+" dog.");
		
		DogHomework Bulldog=new DogHomework();
		
		Bulldog.breed="bulldog";
		Bulldog.size="small";
		Bulldog.weight=25;
		
		System.out.println("My dog is "+Bulldog.breed+" and he is "+Bulldog.size+" dog.");

		DogHomework Labrador=new DogHomework();

		Labrador.breed="lab";
		Labrador.size="medium";
		Labrador.weight=50;
		
		System.out.println("My dog is "+Labrador.breed+" and he is "+Labrador.size+" dog.");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
