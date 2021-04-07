package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ques5 {
    public static ArrayList<Integer> evenElements(int arr[])
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	for(int i:arr)
		{
			if(i%2==0)
			{
				list.add(i);
			}
		}
    	return list;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of data:");
		int n=scan.nextInt();
        int []arr=new int[n];
		
		System.out.println("Enter "+n+" elements to an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("\n"+evenElements(arr));
        scan.close();
	} 

}
