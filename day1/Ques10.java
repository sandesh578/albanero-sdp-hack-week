package day1;

import java.util.Scanner;
public class Ques10 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		int evenCount=0,j=0;
		int []even;
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			if(arr[i]%2==0)
			{
				evenCount+=1;
			}
		}
		
		even=new int[evenCount];
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even[j]=arr[i];
				j++;
			}
		}
		
		System.out.println("Array of even numbers is:");
		for(int i:even)
		{
			System.out.print(i+" ");
		}
		scan.close();

	}

}
