package day4;

import java.util.Scanner;

public class Ques40 {
	public static boolean checkSubsequence(String str1,String str2)
	{
		if(str1.equals(""))
		{
			return true;
		}
		int index=0;
		for(int i=0;i<str2.length();i++)
		{
			if(str2.charAt(i)==str1.charAt(index))
			{
				index++;
			}
			
			if(index>=str1.length())
			{
				return true;
			}
		}
		return false;
	}
	
     public static void main(String[] args)
     {
    	Scanner scan=new Scanner(System.in);
 		System.out.println("Enter a string:");
 		String str1=scan.next();
 		
 		System.out.println("Enter another string:");
 		String str2=scan.next();
 		
 		System.out.println("\n"+checkSubsequence(str1,str2));
 		scan.close();
     }
}
