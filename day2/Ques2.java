package day2;

import java.util.Scanner;

public class Ques2 {

	public static String sortString(String str)
	{
		StringBuilder result=new StringBuilder();
		int n=str.length();
		int []frequency=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			frequency[str.charAt(i)-'a']++;
		}
		
		int count=n;
		while(count>0)
		{
			for(int i=0;i<frequency.length;i++)
			{
				if(frequency[i]!=0)
				{
					result.append((char)(i+97));
					frequency[i]--;
					count--;
				}
			}
			
			for(int i=frequency.length-1;i>=0;i--)
			{
				if(frequency[i]!=0)
				{
					result.append((char)(i+97));
					frequency[i]--;
					count--;
			
		        }
		   }
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
	
		System.out.println(sortString(str));
		scan.close();
		

	}

}
