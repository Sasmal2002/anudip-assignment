package LabTest1;

public class EmployeeMain {


	public static void main(String[] args) {
		//create an instance of person
		Employee e1=new Employee();
	 	e1.name= "Fiza";
		e1.age= 20;
		e1.contact= "9002779764";
		e1.address="HOOGHLY";
		//create an instance of person
	     e1.emp_id= 222;
	     e1.salary= "20000";
	     e1.department= "A";
	     
	     //call the display function of person class using instance
	     e1.display();
	   //call the display function of employee class using instance
	     e1.displayEmployee();
	 
		}


			
		
	}


