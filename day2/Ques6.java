package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		int positiveCount=0,negativeSum=0;
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				positiveCount++;
			}
			else
			{
				negativeSum+=arr[i];
			}
		}
		list.add(positiveCount);
		list.add(negativeSum);
		
		
		System.out.println("\n"+list);
		scan.close();

	}

}
