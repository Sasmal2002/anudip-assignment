package LabTest2;

public class BankMain {

	public static void main(String[] args) {
	BankA bankA=new BankA();
	BankB bankB=new BankB();
	BankC bankC=new BankC();
	//print of the deposited money
	System.out.println("Money deposited in BankA :"+bankA.getBalalance());
	System.out.println("Money deposited in BankB :"+bankB.getBalalance());
	System.out.println("Money deposited in BankC :"+bankC.getBalalance());
	}

}
