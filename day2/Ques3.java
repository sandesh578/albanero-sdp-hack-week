package day2;

import java.util.Scanner;
public class Ques3 {
    public static int onesCount(int mat[][],int r,int c)
    {
    	int count=0;
    	for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==1)
				{
					count++;;
				}
			}
		}
    	return count;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of row:");
		int r=scan.nextInt();
		System.out.println("Enter the number of columns:");
		int c=scan.nextInt();
		int [][]mat=new int[r][c];
		
		System.out.println("Enter "+r*c+" elements to an array:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("mat["+i+"]["+j+"]=");
				mat[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("\n"+onesCount(mat,r,c));
		scan.close();

	}

}
