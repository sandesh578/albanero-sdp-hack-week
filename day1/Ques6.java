package day1;

import java.util.Scanner;
public class Ques6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first element of sequence:");
		int first=scan.nextInt();
		
		System.out.println("Enter constant difference between elements:");
		int diff=scan.nextInt();
		
		System.out.println("Enter total number of elements in sequence:");
		int n=scan.nextInt();
		
		String str="";
		int count=0;
		int i=first;
		while(count!=n)
		{
			if(count==n-1)
			{
				str+=String.valueOf(i)+" ";
			}
			else
			{
			   str+=String.valueOf(i)+", ";
			}
			i+=diff;
			count++;
		}
		
		System.out.println("\n"+str);
		scan.close();

	}

}
