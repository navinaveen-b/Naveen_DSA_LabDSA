package com.gl.dsa;

public class BinarySearchTreeExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
        tree.insertKey(10);
        tree.insertKey(20);
        tree.insertKey(30);
        tree.insertKey(40);
        tree.insertKey(50);
        tree.insertKey(60);
        tree.insertKey(70);
 
        boolean check = tree.isPairNodes(tree.root, tree.root, 30);
        if (!check)
            System.out.println("No such values are found!");
    }

}
