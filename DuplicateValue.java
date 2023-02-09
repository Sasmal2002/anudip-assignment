package LabTest2;

public class DuplicateValue {

	public static void main(String[] args) {
		//Deceleration and Initialize array
int []arr={2,3,6,5,7,3,7,6};
System.out.println("Duplicates values are given array:");

for(int i=0;i<arr.length;i++) {
	for(int j= i+1;j<arr.length;j++) {
		if(arr[i]==arr[j])
		System.out.println(arr[j]);//print Duplicates values
			
		
	}
}

	}

}
