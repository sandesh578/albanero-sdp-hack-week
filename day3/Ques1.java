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
	Node head1=null;
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
			while(currNode.next!=null)
			{
				currNode=currNode.next;
			}
			currNode.next=newNode;
			currNode=newNode;
		}
	}
	public void reorderList()
	{
		if(head==null)
		{
			return;
		}
		Node odd=head;
		Node even=head.next;
		Node temp=even;
		
		while(even!=null&&even.next!=null)
		{
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
			
		}
		odd.next=temp;
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
				 if(temp.next==null)
				 {
					 System.out.print(temp.data); 
				 }
				 else
				 {
				   System.out.print(temp.data+"->");
				 }
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
		System.out.println("Before Swapping:");
		list.display();
		list.reorderList();
		System.out.println("\nAfter Swapping:");
		list.display();
		scan.close();

	}

}
