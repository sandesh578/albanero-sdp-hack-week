package day3;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class LinkedList
{
	Node head=null;
	public void add(int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node currNode=head;
			currNode.next=newNode;
			currNode=newNode;
		}
	}
	public void display()
	{
		Node temp;
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			 temp=head;
			 while(temp!=null)
			 {
				 System.out.print(temp.data+" ");
				 temp=temp.next;
			 }
		}
	}
	
}
public class Ques1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("Enter the number of elements you want to insert:");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" elements to an LinkedList:");
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		}
		list.display();
		scan.close();

	}

}
