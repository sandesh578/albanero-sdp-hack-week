package day2;

import java.util.Scanner;
public class Ques4 {
	
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

		 for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr.length-i-1;j++)
			  {
				  if(arr[j]>arr[j+1])
				  {
					  int temp=arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
				  }
			  }
		  }
		
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		scan.close();

	}

}
