package day1;

import java.util.Scanner;
public class Ques2 {

	public static int maxDepth(String str)
	{
		int depth=0;
		int countOpen=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				countOpen++;
			}
			if(str.charAt(i)==')')
			{
				countOpen--;
			}
			depth=Math.max(depth,countOpen);
		}
		return depth;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.nextLine();
		
		
		System.out.println(maxDepth(str));
		
		scan.close();

	}

}
