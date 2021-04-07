package day1;

import java.util.Scanner;

public class Ques9 {

	public static int maxProfit(int []prices)
	{
		int n=prices.length;
		int profit=0;
		int diff[]=new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			diff[i]=prices[i+1]-prices[i];
		}
		for(int i=0;i<n-1;i++)
		{
			if(diff[i]>=0)
			{
				profit+=diff[i];
			}
		}
		return profit;
		
	}
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int []prices=new int[n];
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			prices[i]=scan.nextInt();
		}
		
		System.out.println("\n"+maxProfit(prices));
		
		scan.close();
	}

}
