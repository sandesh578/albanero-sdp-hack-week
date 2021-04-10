package day4;

import java.util.Scanner;

public class Ques36 {
	public static int noOfWays(int steps)
	{
		int ways[]=new int[steps+1];
		ways[1]=1;
		ways[2]=2;
		for(int i=3;i<=steps;i++)
		{
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[steps];
	}
     public static void main(String[] args)
     {
    	Scanner scan=new Scanner(System.in);
 		System.out.println("Enter a number of steps:");
 		int steps=scan.nextInt();
 		
 		System.out.println("\n"+noOfWays(steps));
 		scan.close();
     }
}
