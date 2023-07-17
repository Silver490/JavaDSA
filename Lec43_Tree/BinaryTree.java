package Lec43_Tree;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		this.root = CreateTree();
	}

	private Node CreateTree() {
		int item = sc.nextInt();
		Node n = new Node();
		n.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			n.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			n.right = CreateTree();
		}

		return n;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.data + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node nn) {
		if (nn==null) {
			return;
		}
		
		postOrder(nn.left);
		postOrder(nn.right);
		System.out.println(nn.data+" ");
	}
	
	
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node nn) {
		if (nn==null) {
			return;
		}
		
		inOrder(nn.left);
		System.out.println(nn.data+" ");
		inOrder(nn.right);
	}
	
	
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node nn) {
		if (nn==null) {
			return;
		}
		
		System.out.println(nn.data+" ");
		preOrder(nn.left);
		preOrder(nn.right);
	}
}
