package com.bridgelabz.programs.tempCreateClass;

public class BinarySearchTree 
{	
	class Node
	{
		int key;
		Node left,right;
		
		Node(int item)
		{
			this.key = item;
			this.left = null;
			this.right = null;
		}
		
	}
	public static Node root;
	BinarySearchTree()
	{
		root = null;
	}
	public  void insert(int key) 
	{
		root=addItem(root,key);
	}
	 Node addItem(Node root,int key) 
	{
		if(root==null) 
		{
			root=new Node(key);
			return root;
		}
		if(key<root.key) 
		{
			root.left=addItem(root.left,key);
			
		}
		else if(key>root.key) 
		{
		root.right=addItem(root.right,key);	
		}
		return root;
	}
	 public  void  displayFun(Node root) 
	 {
		 if(root!=null) 
		 {	
			 displayFun(root.left);
			 System.out.println(root.key);
			 displayFun(root.right);
		 }
	 }

	public static void main(String[] args) 
	{
		BinarySearchTree search=new  BinarySearchTree();
		search.insert(5);
		search.insert(6);
		search.insert(8);
		search.insert(2);
		search.displayFun(root);
	}

}
