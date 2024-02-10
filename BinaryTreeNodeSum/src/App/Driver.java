package App;

import java.util.ArrayList;
import java.util.Scanner;

import Service.Node;

import Service.BinaryTree;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//Creating the tree
		BinaryTree bt=new BinaryTree();
		Node root=bt.createNewTree();
		if(root!=null)//Traverse Tree
			bt.checkNodeSum(root);
	}
	
}