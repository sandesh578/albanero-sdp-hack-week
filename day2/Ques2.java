package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ques2 {

	public static String sortString(String str)
	{
		StringBuilder result=new StringBuilder();
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			list.add(str.charAt(i));
		}
        
		char current,last;
		while(!list.isEmpty())
		{
			Collections.sort(list);
		    int i=0;
			current=list.get(i);
			result.append(current);
			list.remove(i);
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(j)>current)
				{
					current=list.get(j);
					result.append(current);
					list.remove(j);
				}
			}
			Collections.sort(list,Collections.reverseOrder());
			int k=0;
            if(!list.isEmpty())
			{last=list.get(k);
			result.append(last);
			list.remove(k);
            
			for(int j=k+1;j<list.size();j++)
			{
				if(list.get(j)<last)
				{
					last=list.get(j);
					result.append(last);
					list.remove(j);
				}
			}
        }
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scan.next();
	
		System.out.println(sortString(str));
		scan.close();
		

	}
}
