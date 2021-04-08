package day3;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques9 {

	public static int squares(int n)
	{
		String num="";
		int rem=0;
		ArrayList<Integer> list=new ArrayList<>();
		while(n!=0)
		{
			rem=n%10;
			list.add((int) Math.pow(rem,2));
			n=n/10;
		}
		for(int i=list.size()-1;i>=0;i--)
		{
			num+=String.valueOf(list.get(i));
		}
		return Integer.parseInt(num);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		
		System.out.println("\n"+squares(n));
		scan.close();

	}

}
