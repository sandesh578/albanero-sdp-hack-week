package day3;

import java.util.HashSet;
import java.util.Scanner;
public class Ques6 {
    public static  boolean repDigintOrNot(int num)
    {
    	int count=0;
    	HashSet<Integer> set=new HashSet<>();
    	if(num==0)
    	{
    		return true;
    	}
    	else if(num>0)
    	{
    		 while(num!=0)
    		 {
    			 set.add(num%10);
    			 num=num/10;
    			 count++;
    		 }
    	}
    	if(set.size()==1&&count>1)
    	{
    		return true;
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		
		System.out.println("\n"+repDigintOrNot(num));
		scan.close();

	}

}
