package com.bridgelabz.programs.tempCreateClass;

public class ImplLinkedList {
	
	Node head;
	Node tail;
	
	class Node 
	{
		int data;
		Node next;
	
		Node(int data) 
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public void addFront(int data) 
	{
		Node newNode=new Node(data);
		if(head==tail) 
		{
			newNode.next=head;
			head=newNode;
			tail=newNode;
		}else 
		
			if(head==null) 
			{
				newNode=head;
				tail=newNode;
			}
	}
	
	public void addLast(int data) 
	{	Node newNode=new Node(data);
		if(head==null) 
		{
			head=newNode;
			tail=newNode;
		}
		else 
		{
			tail.next=newNode;
			tail=newNode;
		}
		
		
	}
	
	public void addAtposition(int postion,int data) 
	{
		Node newNode=new Node(data);
		Node current=head;
		Node temp=null;
		for(int i=1;i<postion;i++)
		{
			temp=current;
			current=current.next;
		}
		temp.next=newNode;
		newNode.next=current;
	}
	public void deleteLastNode(int location) 
	{
		Node current=head;
		Node temp=null;
		for(int i=0;i<location;i++) 
		{
			temp=current;
			current=current.next;
		}
		current=null;
		temp.next=current.next;
	}
	
	public void display() 
	{
		Node current =head;
		while(current!=null) 
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String[] args) 
	{
		ImplLinkedList linkedList=new ImplLinkedList();
		linkedList.addLast(3);
		linkedList.addLast(4);
		linkedList.addLast(7);
		linkedList.addAtposition(2,10);
	//	linkedList.deleteLastNode(2);
		linkedList.display();
	}

}
