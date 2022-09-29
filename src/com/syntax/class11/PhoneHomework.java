package com.syntax.class11;

public class PhoneHomework {

	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with
	// specific attributes and behaviors.

	String color;
	String model;
	String make;
	int price;
	int size;

	void call() {
		System.out.println("Calling ");
	}

	void record() {
		System.out.println("Making a video");
	}

	void message() {
		System.out.println("Send a message");
	}

	public static void main(String[] args) {
		PhoneHomework Iphone = new PhoneHomework();
		
		Iphone.color = "black";
		Iphone.model = "13";
		Iphone.make = "Apple";
		Iphone.price = 1499;
		Iphone.size = 11;
		
		System.out.println(Iphone.make + " Iphone " + Iphone.model + " cost " + Iphone.price);
		
		PhoneHomework Pixel = new PhoneHomework();
		
		Pixel.color = "white";
		Pixel.make = "google";
		Pixel.price = 500;
		
		System.out.println("My phone is made by " + Pixel.make + " and cost only " + Pixel.price);
		
		PhoneHomework Samsung = new PhoneHomework();
		Samsung.color = "blue";
		Samsung.make = "samsung";
		Samsung.price = 1000;
		
		System.out.println("My new phone is " + Samsung.make + " " + Samsung.color + " color and cost only " + Samsung.price);

	}

}
