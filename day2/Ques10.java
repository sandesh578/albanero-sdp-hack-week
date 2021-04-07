package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ques10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scan.nextInt();
		int sum=0,count=0;
		
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter "+n+" elements to an arrayList:");
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		}
		
		Collections.sort(list,Collections.reverseOrder());
		for(int i:list)
		{
			if(count==5)
			{
				break;
			}
			sum+=i;
			count++;
		}
		
		System.out.println("\n"+sum);
        scan.close();
	} 

}
