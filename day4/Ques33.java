package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques33 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an araray:");
		int n=scan.nextInt();
		
		ArrayList<String> list=new ArrayList<>();
		System.out.println("Enter "+n+" elements to an arrayList:");
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			String firstletter=str.substring(0,1).toUpperCase();
			String remaining=str.substring(1,str.length());
			list.add((firstletter+remaining));
		}
		
		
		System.out.println("\n"+list);
		scan.close();

	}

}
