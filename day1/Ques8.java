package day1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Ques8 {

	public static int maxSum(int arr[],int k)
	{
		PriorityQueue<Integer> heap=new PriorityQueue<>();
		for(int i:arr)
		{
			heap.add(i);
		}
		while(k-- > 0)
		{
			heap.add(-heap.poll());
		}
		int sum=0;
		for(int i=0;i<heap.size();i++)
		{
			sum+=heap.poll();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter the number of replacement:");
		int k=scan.nextInt();
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("\n"+maxSum(arr,k));
		
		scan.close();

	}

}