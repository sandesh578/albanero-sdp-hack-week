package day3;

import java.util.Scanner;
public class Ques10 {
	
    public static int mean(int num)
    {
    	int count=0;
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
			count++;
		}
		return sum/count;
    }
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		
		System.out.println("\n"+mean(num));
		scan.close();

	}

}
