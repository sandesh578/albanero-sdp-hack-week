package day4;

import java.util.Scanner;

public class Ques37 {
	public static int binaryNumber(int num)
	{
		String str="";
		int rem=0;
		while(num>0)
		{
			rem=num%2;
			str=rem+str;
			num=num/2;
		}
		return Integer.parseInt(str);
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
