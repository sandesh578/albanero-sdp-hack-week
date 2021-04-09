package day4;

import java.util.Scanner;

public class Ques38 {
	public static int minimumCost(int[] cost)
	{
		
		return 0;
	}
     public static void main(String[] args)
     {
    	Scanner scan=new Scanner(System.in);
 		System.out.println("Enter a size of cost aray:");
 		int n=scan.nextInt();
 		
 		int[] cost=new int[n];
 		System.out.println("Enter "+n+" elements to cost array:");
 		for(int i=0;i<n;i++)
 		{
 			cost[i]=scan.nextInt();
 		}
 		
 		System.out.println("\n"+minimumCost(cost));
 		scan.close();
     }
}
