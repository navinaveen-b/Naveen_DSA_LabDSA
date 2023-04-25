package com.gl.dsa;

public class BinarySearchTree {
	Node root;
	 
	BinarySearchTree() { 
		root = null;
	}
	public void insertKey(int key) {
		root = insertNode(root, key);
	}
	public Node insertNode(Node root, int data)
	{
		if (root == null) {
			root = new Node(data);
			return root;
		}
	    if (data < root.data)
	    	root.left = insertNode(root.left, data);
	    else if (data > root.data)
	    	root.right = insertNode(root.right, data);
	    return root;
	}
	public boolean isPairNodes(Node root, Node aux, int sum)
	{
		 if (aux == null)
			 return false;
		 return searchNodes(root, aux, sum - aux.data)
				 || isPairNodes(root, aux.left, sum)
				 || isPairNodes(root, aux.right, sum);
	}
	
	public boolean searchNodes(Node root, Node aux, int k)
	{
	 if (root == null)
			 return false;
		 Node cur = root;
		 boolean flag = false;
		 while (cur != null && flag != true) {
			 if (cur.data == k && aux != cur) {
				 flag = true;
				 System.out.println("Pair Nodes Found: " + cur.data
	                                   + " and " + aux.data);
				 return true;
			 }
	         else if (k < cur.data)
	        	 cur = cur.left;
			 else
				 cur = cur.right;
		}
		return false;
	}

}
