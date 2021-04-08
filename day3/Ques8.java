package day3;

import java.util.Scanner;
public class Ques8 {

	public static String appendParityBit(String binStr)
	{
		int n=Integer.parseInt(binStr);
		int count=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==1)
			{
				count++;
			}
			n=n/10;
		}
		
		StringBuilder sb=new StringBuilder(binStr);
		if(count%2==0)
		{
			sb.append(0);
		}
		else
		{
			sb.append(1);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Binary String:");
		String binStr=scan.next();
		
		System.out.println("\n"+appendParityBit(binStr));
		scan.close();

	}

}
