package Lec44;

import java.util.*;

public class Level_Order {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Level_Order() {
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

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();

		q.add(root);
		while (!q.isEmpty()) {
			// remove
			Node nn = q.poll();
			System.out.print(nn.data + " ");
			if (nn.left != null) {
				q.add(nn.left);
			}
			if (nn.right != null) {
				q.add(nn.right);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Level_Order l=new Level_Order();
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		l.LevelOrder();
	}

}
