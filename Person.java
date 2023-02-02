package LabTest1;

public class Person {
	//instance variable
			String name;
			int age;
			String contact;
			String address;
		 
			//default contractor
			Person(){
				System.out.println("Default constractor of person .....");
				}
			//Parameterized constructor
			Person(String name,int age,String contact, String address ){
				System.out.println("Parameterized constructor of Person......");
				this.name=name;
				this.age=age;
				this.contact=contact;
				this.address=address;
				
			}
		//to display the information
			public void display() {
				System.out.println("name:"+name);
				System.out.println("age:"+age);
				System.out.println("contact:"+contact);
				System.out.println("address:"+address);
			}
}
