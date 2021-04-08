package day3_Ques2;

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
			while(currNode.next!=null)
			{
				currNode=currNode.next;
			}
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
				 if(temp.next==null)
				 {
					 System.out.print(temp.data+" "); 
				 }
				 else
				 {
					 System.out.print(temp.data+"->");
				 }
				 temp=temp.next;
			 }
		}
	}
	public void swapAdjacent() {
		if(head==null|head.next==null)
		{
			return;
		}
		
		Node current=head;
		Node prev=null;
		while(current!=null&&current.next!=null)
		{
			if(current==head)
			{
				head=head.next;
			}
			else
			{
				prev.next=current.next;
			}
			
			Node temp=current.next.next;
			current.next.next=current;
			current.next=temp;
			
			prev=current;
			current=temp;
		}
	}
	
}
public class Ques2 {

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
		System.out.println("Before swapping:");
		list.display();
		list.swapAdjacent();
		System.out.println("\nAfter swapping:");
		list.display();
		scan.close();

	}

}
