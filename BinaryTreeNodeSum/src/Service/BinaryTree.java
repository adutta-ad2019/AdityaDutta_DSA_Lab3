package Service;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
	public Node createNewTree() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter root node value");
		int rootVal=sc.nextInt();
		if(rootVal==-1) {
			System.out.println("Root is set to null, Please re-run valid root");
			return null;
		}
		Node root=new Node(rootVal);
		createTree(root);	
		return root;
	}
	private void createTree(Node root) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter"+root.getVal()+".left");
		int leftVal=sc.nextInt();
		if(leftVal==-1) 
			root.setLeft(null);
		else{
			root.setLeft(new Node(leftVal));
			createTree(root.getLeft());
		}
		System.out.println("Enter"+root.getVal()+".right");
		int rightVal=sc.nextInt();
		if(rightVal==-1) 
			root.setRight(null);
		else
		{
			root.setRight(new Node(rightVal));
			createTree(root.getRight());
		}
	}
	public void traverse(Node root,ArrayList<Integer> arl) {
		if(root!=null) {
		arl.add(root.getVal());
		traverse(root.getLeft(),arl);
		traverse(root.getRight(),arl);
		// TODO Auto-generated method stub
		}	
	}
	public ArrayList<Integer> listOfValues(Node root){
		ArrayList<Integer> arl=new ArrayList<Integer>();
		traverse(root,arl);
		return arl;
	}
	public void checkNodeSum(Node root) {
		System.out.println("Enter the desired sum");
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		ArrayList<Integer> arl=listOfValues(root);
		boolean pairExists=false;
		for(int i:arl)
			if(sum>i&&sum!=2*i&&arl.contains(sum-i)) {
				System.out.println("Pair is ("+i+","+(sum-i)+")");
				pairExists=true;
				break;
			}
		if(!pairExists)
			System.out.println("Pair of Nodes not found");
	}
}
