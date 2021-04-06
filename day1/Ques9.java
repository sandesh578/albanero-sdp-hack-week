package day1;

import java.util.Scanner;

public class Ques9 {

	public static int maxProfit(int []prices,int start,int end)
	{
		int profit=0;
		if(end<=start)
		{
			return 0;
		}
		
		for(int i=0;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(prices[j]>prices[i])
				{
					int currProfit=prices[j]-prices[i]+maxProfit(prices,start,i-1)+maxProfit(prices,j+1,end);
					
					profit=Math.max(profit,currProfit);
				}
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
		
		System.out.println("\n"+maxProfit(prices,0,n-1));
		
		scan.close();
	}

}
