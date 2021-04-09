package day4;

import java.util.Scanner;

public class Ques39 {
	
    public static int largestSum(int[] num)
    {
    	int max=num[0];
    	int current=num[0];
    	for(int i=1;i<num.length;i++)
    	{
    		if(current<0)
    		{
    			current=num[i];
    		}
    		else
    		{
    			current+=num[i];
    		}
    		max=Math.max(current,max);
    	}
		return max;
	
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" array into an array:");
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.println("\n"+largestSum(num));
		scan.close();

	}

}
