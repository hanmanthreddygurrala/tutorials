package com.hany.tutorials.oops.Encapsulation;

public class EncapsulationImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encapsulation = new Encapsulation();
		
		encapsulation.setFirstname("Hanmanth Reddy");
		encapsulation.setLastname("Gurrala");
		encapsulation.setGender("male");
		encapsulation.setAge(31);
		
		System.out.println("Name: "+encapsulation.getFirstname()+" "+encapsulation.getLastname());
		System.out.println("Gender: "+encapsulation.getGender());
		System.out.println("Age: "+encapsulation.getAge());
	}

}
