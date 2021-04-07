package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques4 {
	public static ArrayList<Integer> sort(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		  {
			  for(int j=0;j<list.size()-i-1;j++)
			  {
				  if((int)list.get(j)>(int)list.get(j+1))
				  {
					  int temp=(int)list.get(j+1);
					  list.set(j+1,(int)list.get(j));
					  list.set(j,temp);
				  }
			  }
		  }
		return list;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		
		System.out.println("Enter "+n+" elements to an arraylist:");
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		}
		
		System.out.println("\n"+sort(list));
		scan.close();

	}

}
