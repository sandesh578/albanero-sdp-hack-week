package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques8 {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter the number whose factors are to be calculated:");
		int n=scan.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				list.add(i);
			}
		}
		
		System.out.println("\n"+list);
        scan.close();
	}

}
