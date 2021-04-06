package day1;

import java.util.Scanner;

public class Ques3 {
    
	public static String evenOrOdd(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		if(sum%2==0)
		{
			return "even";
		}
		return "odd";
		
	}
	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		String str=evenOrOdd(arr);
		System.out.println("\n"+str);
		scan.close();
	}

}
