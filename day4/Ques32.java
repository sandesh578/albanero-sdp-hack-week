package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques32 {
	public static void sort(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length-i-1;j++)
			{
				if(num[j+1]<num[j])
				{
					int temp=num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
				}
			}
		}
	}
    public static ArrayList<Integer> removeDuplicates(int[] num)
    {
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i:num)
    	{
    		list.add(i);
    	}
    	for(int i=0;i<list.size();i++)
    	{
    		for(int j=i+1;j<list.size();j++)
        	{
        		if(list.get(i).equals(list.get(j)))
        		{
        			list.remove(j);
        			j--;
        		}
        	}
    	}
		return list;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements into an array:");
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=scan.nextInt();
		}
		sort(num);
	
		System.out.println("\n"+removeDuplicates(num));
		scan.close();

	}

}
