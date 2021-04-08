package day3;

import java.util.Scanner;
public class Ques4 {
    public static int[][] reverseImage(int mat[][],int r,int c)
    {
    	for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==0)
				{
					mat[i][j]=1;
				}
				else
				{
					mat[i][j]=0;
				}
			}
		}
    	return mat;
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
		
		int rev[][]=new int[r][c];
		rev=reverseImage(mat,r,c);
		
		System.out.println();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(rev[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
