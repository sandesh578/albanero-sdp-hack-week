package day1;

import java.util.Scanner;
public class Ques7 {

	public static int maxConsecutiveOnes(int arr[],int k)
	{
		int n=arr.length;
		int max=0;
		int current=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				k--;
			}
			while(current<=i&&k<0)
			{
				if(arr[current]==0)
				{
					k++;
				}
				current++;
			}
			max=Math.max(i-current+1,max);
		}
	
		return max;
	}
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of array of 0's and 1's:");
		int n=scan.nextInt();
		
		System.out.println("Enter the number of replacement:");
		int k=scan.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("\n"+maxConsecutiveOnes(arr,k));
		scan.close();

	}

}
