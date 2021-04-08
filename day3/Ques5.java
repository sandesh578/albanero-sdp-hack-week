package day3;

import java.util.HashSet;
import java.util.Scanner;
public class Ques5 {
    public static  boolean isogramOrNot(String str)
    {
        int length=str.length();
    	HashSet<Character> set=new HashSet<>();
    	for(int i=0;i<length;i++)
    	{
    		set.add(str.toLowerCase().charAt(i));
    	}
    	if(length==set.size())
    	{
    		return true;
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.next();
		
		System.out.println("\n"+isogramOrNot(str));
		scan.close();

	}

}
