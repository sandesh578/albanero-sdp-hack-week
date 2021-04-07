package day2;

import java.util.Scanner;
public class Ques9 {

	public static boolean checkForSum(int arr[],int data)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==data)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter the data to check:");
		int data=scan.nextInt();
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("\n"+checkForSum(arr,data));
        scan.close();
	}

}
