package com.bridgelabz.programs.tempCreateClass;

public class SearchTreeBinaryPro 
{
	class  Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			Node left=null;
			Node right=null;
		}
	}
	 static Node root;
	public  void insert(int data) 
	{
		Node newNode=new Node(data);
		if(root==null) 
		{
			root=newNode;
			return;
		}
		Node current=root;
		Node parent=null;
		while(true) 
		{
			parent=current;
			if(data<current.data) 
			{
				current=current.left;
				if(current==null) 
				{
					parent.left=newNode;
					return;
				}
			
			}
			else 
			{
				current=current.right;
				if(current==null) 
				{
					parent.right=newNode;
					return;
				}
				
			}
		}
		
	}
	Node search(Node root,int key)
	{
		if(root==null) 
		{
			root=new Node(key);
			return root;
		}
		if(key<root.data) 
		{
			root.left=search(root.left,key);
		}
		else if(key>root.data) 
		{
			root.left=search(root.right,key);
			
		}
		return root;
	}
	void insertSearchKey(int key)
	{
		root=search(root, key);
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	public static void main(String[] args) 
	{
		SearchTreeBinaryPro searchTree=new SearchTreeBinaryPro();
		searchTree.insert(10);
		searchTree.insert(4);
		searchTree.insert(1);
		searchTree.insert(3);
		searchTree.insert(14);
		searchTree.insert(2);
		searchTree.insert(5);
		searchTree.display(root);
		searchTree. insertSearchKey(5);
	}

}
