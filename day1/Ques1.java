package day1;

import java.util.Random;
import java.util.Scanner;
public class Ques1 {

	public static String generateString(int n)
	{
		StringBuilder sb=new StringBuilder();
		Random rand=new Random();
		int random1=rand.nextInt((122-97)+1)+97;
		int random2=rand.nextInt((122-97)+1)+97;			
		if(n%2==0)
		{
			for(int i=0;i<n-1;i++)
			{
			   sb.append((char)random1);
			}
			sb.append((char)(rand.nextInt((122-97)+1)+97));
		}
		else
		{
			for(int i=0;i<n;i++)
			{
			   sb.append((char)random2);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of string:");
		int n=scan.nextInt();
		
		String str=generateString(n);
		System.out.println(str);
		scan.close();

	}

}
