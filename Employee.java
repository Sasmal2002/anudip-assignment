package LabTest1;

public class Employee extends Person{
	//instance variable
	int emp_id;
	String salary;
	String department;
	//Default constructor
   Employee(){
	   super();
		System.out.println("Default constructor of Employee.....");
	}
   // Parameterized  constructor
Employee(String name,int age,String contact, String address,String depertment, String salary, int emp_id ){
	super ( name, age,contact,address );
	this.name=name;
	this.age=age;
	this.contact=contact;
	this.address=address;
	this.emp_id=emp_id;
	this.salary=salary;
	this.department=depertment;
}
//to displayEmployee the information
public void displayEmployee() {
	System.out.println("emp_id:"+emp_id);
	System.out.println("salary:"+salary);
	System.out.println("department:"+department);
	
}

}
