package Lec43_Tree;

import java.util.Scanner;

public class BinaryTree2 {

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree2() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
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
}