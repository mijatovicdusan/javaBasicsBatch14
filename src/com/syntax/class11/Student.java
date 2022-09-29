package com.syntax.class11;

public class Student {
	
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		
		System.out.println("Student is studying");
	}
	void deleteMesagges() {
		
		System.out.println("Deleting messages from discord");
	}
	void eat() {
		
		System.out.println("eating pizaaaaa");
	}
	public static void main(String[] args) {
		
		Student newObject=new Student();
		newObject.name="Dusan";
		newObject.id="123";
		newObject.age=22;	
		
		
		System.out.println(newObject.name);
		System.out.println(newObject.age);

		System.out.println("__________________");
		
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='f';
		System.out.println(student2.name);
		student2.eat();
		
		
		
		
	}
}
