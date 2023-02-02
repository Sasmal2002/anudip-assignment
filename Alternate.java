package LabTest1;

public class Alternate {
	public static void main(String[] aggs) {
	int arr[]= {4,5,8,9,6,10,11,13};//array declaration and initialization
	System.out.println("The sum of alternative numbers are :"+alternate(arr));
	
}

public static int alternate(int arr1[])
{
	int j=0,sum=0;
	int arr2[]=new int[arr1.length];//array declaration and memory allocation
	System.out.println("The alternetive array is:");
	//print alternative array
	for(int i=0;i<arr1.length;i+=2)
	{
		arr2[j]=arr1[i];
		sum+=arr2[j];//calculate the sum of alternative array values
		j++;	
	}
	return sum;//return sum value to main method

}
}
