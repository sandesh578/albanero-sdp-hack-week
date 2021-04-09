package day4;

import java.util.Scanner;

public class Ques35 {
    public static boolean sumIsEqualOrNot(int num[])
    {
    	int sum1=0,sum2=0;
    	while(num[0]!=0)
    	{
    		sum1=sum1+(num[0]%10);
    		num[0]=num[0]/10;
    	}
    	while(num[1]!=0)
    	{
    		sum2=sum2+(num[1]%10);
    		num[1]=num[1]/10;
    	}
    	if(sum1==sum2)
    	{
    		return true;
    	}
    	return false;

    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two elements into an array:");
		int num[]=new int[2];
		
		for(int i=0;i<2;i++)
		{
			num[i]=scan.nextInt();
		}
		
		System.out.println("\n"+sumIsEqualOrNot(num));
		scan.close();

	}

}
