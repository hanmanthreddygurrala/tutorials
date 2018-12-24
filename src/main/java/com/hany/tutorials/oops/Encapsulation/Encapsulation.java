package com.hany.tutorials.oops.Encapsulation;



/*
 *  To achieve encapsulation in Java −
	Declare the variables of a class as private.
	Provide public setter and getter methods to modify and view the variables values.
	
	Benefits of Encapsulation:
	
	The fields of a class can be made read-only or write-only.
	A class can have total control over what is stored in its fields.
	
	Data Hiding: The user will have no idea about the inner implementation of the class. 
				 It will not be visible to the user that how the class is storing values in the variables. He only knows that we are passing the values to a setter method and variables are getting initialized with that value.
	Increased Flexibility: We can make the variables of the class as read-only or 
						   write-only depending on our requirement. If we wish to 
						   make the variables as read-only then we have to omit the 
						   setter methods like setName(), setAge() etc. from the above 
						   program or if we wish to make the variables as write-only then 
						   we have to omit the get methods like getName(), getAge() etc. 
						   from the above program
	Reusability: Encapsulation also improves the re-usability and easy to change with new 
				 requirements.
	Testing code is easy: Encapsulated code is easy to test for unit testing.
 * */

public class Encapsulation {
	
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
