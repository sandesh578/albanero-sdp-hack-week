package day1;

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
			arr[i]+=1;//Adding 1 to every input array elements
		}
		
		System.out.println("Elements in an array are:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		scan.close();

	}

}
