package duplicateElemtOperations;

import java.util.Scanner;

public class Duplicate_in_Merged_Array 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Array Size");
		int size1 = s.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter the 1st Array Elemets");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i] = s.nextInt();
		}
		
		System.out.println("Enter the 2nd Array Size");
		int size2 = s.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter the 2nd Array Elemets");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i] = s.nextInt();
		}
		
		int size3 = arr1.length + arr2.length;
		int arr3[] = new int[size3];
		for(int i=0;i<=arr3.length-1;i++)
		{
			if(i<arr1.length)
				arr3[i] = arr1[i];
			else
				arr3[i] = arr2[i-arr1.length];
		}	
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr3[j] == arr3[i])
					System.out.print(arr3[j]+" ");
			}
		}
		
	}
}
