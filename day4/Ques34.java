package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques34 {
    public static int digitDistance(int num1,int num2)
    {
    	int sum=0;
    	ArrayList<Integer> list1=new ArrayList<>();
    	ArrayList<Integer> list2=new ArrayList<>();
    	while(num1!=0)
    	{
    		list1.add(num1%10);
    		list2.add(num2%10);
    		num1=num1/10;
    		num2=num2/10;
    	}
    	for(int i=list1.size()-1;i>=0;i--)
    	{
    		sum+=Math.abs(list1.get(i)-list2.get(i));
    	}
    	return  sum;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1=scan.nextInt();
		
		System.out.println("Enter another number:");
		int num2=scan.nextInt();
		
		System.out.println("\n"+digitDistance(num1,num2));
		scan.close();

	}

}
