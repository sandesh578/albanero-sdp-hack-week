package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques8 {

	public static ArrayList<Integer> factors(int n)
	{
        ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter the number whose factors are to be calculated:");
		int n=scan.nextInt();
		
		
		System.out.println("\n"+factors(n));
        scan.close();
	}

}
