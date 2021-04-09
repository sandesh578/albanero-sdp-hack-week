package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques37 {
	public static int countOnes(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
			{
				count++;
			}
		}
		return count;
	}
	public static ArrayList<Integer> binaryNumber(int num)
	{
		ArrayList<Integer> list=new ArrayList<>();
		int rem=0;
		for(int i=0;i<=num;i++)
		{
			String str="";
			int n=i;
			while(n>0)
			{
				rem=n%2;
				str=rem+str;
				n=n/2;
			}

			list.add(countOnes(str));
		}
		return list;
	}
     public static void main(String[] args)
     {
    	Scanner scan=new Scanner(System.in);
 		System.out.println("Enter a number:");
 		int num=scan.nextInt();
 		
 		System.out.println("\n"+binaryNumber(num));
 		scan.close();
     }
}
