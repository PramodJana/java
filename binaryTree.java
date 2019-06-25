import java.io.*;
import java.util.*;
class Node
{
	int key;
	Node left, right;
	
	Node(int item)
	{
		key=item;
		left=right=null;
	}
}

class binaryTree
{
	Node root;

	binaryTree(int key)
	{
		root=new Node(key);
	}

	binaryTree()
	{
		root=null;
	}

	public static void main(String []args)
	{
		binaryTree tree=new binaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
	}
}
