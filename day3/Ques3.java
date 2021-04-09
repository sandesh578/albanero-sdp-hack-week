package day3_ques3;

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
	public void reorderList()
	{
		if(head==null||head.next==null)
		{
			return;
		}
		
		Node node1=head;
		Node node2=head;
		while(node2!=null&&node2.next!=null)
		{
			node1=node1.next;
			node2=node2.next.next;
		}
		Node prev=null;
		Node current=node1.next;
		Node temp;
		
		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		
		Node second=prev;
		node1.next=null;
		
		node1=head;
		node2=second;
		Node temp1,temp2;
		
		while(node2!=null)
		{
			temp1=node1.next;
			node1.next=node2;
			temp2=node2.next;
			node2.next=temp1;
			
			node1=temp1;
			node2=temp2;
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
	
}
public class Ques3 {

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
