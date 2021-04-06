package day1;

import java.util.Scanner;
public class Ques5 {

	public static int outlierNumber(int arr[])
	{
		int evenCount=0,oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount+=1;
			}
			else
			{
				oddCount+=1;
			}
		}
		
		if(evenCount<oddCount)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					return arr[i];
				}
			}
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
				{
					return arr[i];
				}
			}
		}
		return 0;
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
		
		int number=outlierNumber(arr);
		System.out.println("\n"+number);
		scan.close();

	}

}
