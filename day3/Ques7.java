package day3;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques7 {
    public static  ArrayList<Integer> arrayOfMultiples(int num,int length)
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	for(int i=1;i<=length;i++)
    	{
    		list.add(num*i);
    	}
    	return list;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		System.out.println("Enter a length:");
		int length=scan.nextInt();
		
		System.out.println("\n"+arrayOfMultiples(num,length));
		scan.close();

	}

}
