import java.io.*;
import java.util.*;

class tree
{
	class Node
	{
		int data;
		Node right, left;	
	
		public Node(int key)
		{
			data=key;
			right=left=null;
		}
	}
	Node root;

	tree()
	{
		root = null;
	}

	void insert(int key)
	{
		root=insertrec(root,key);
	}

	Node insertrec(Node root, int key)
	{
		if (root==null)
		{
			root=new Node(key);
			return root;
		}
		
		if(key<root.data)
		{
			root.left=insertrec(root.left,key);
		}	
		
		if(key>root.data)
		{
			root.right=insertrec(root.right,key);
		}
		
	return root;
	}
	
	void inorder()
	{
		inorderRec(root);
	}

	 void inorderRec(Node root) { 
        if(root != null) { 
            inorderRec(root.left); 
            System.out.println(root.data); 
            inorderRec(root.right); 
        } 
    } 
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		tree BST= new tree();
		System.out.println("Enter the number of nodes");
		int size=kb.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<size;i++)
			BST.insert(kb.nextInt());
		
		BST.inorder();
	}
	
}
