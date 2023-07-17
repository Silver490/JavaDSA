package Lec56_Graph_Kruskal_algo;

import java.util.*;

public class Disjoint_Set {
	public class Node {
		int val;
		Node parent;
		int rank;
	}

	HashMap<Integer, Node> map = new HashMap<>();

	// O(1)
	public void Create(int val) {
		Node node = new Node();
		node.val = val;
		node.parent = node;
		node.rank = 0;
		map.put(val, node);
	}

	public int find(int val) {
		Node node = map.get(val);
		return find(node).val;
	}

	private Node find(Node node) {

		if (node.parent == node) {
			return node;
		}

		Node nn = find(node.parent);

		return nn;
	}

	public void Union(int e1, int e2) {

		Node n1 = map.get(e1);
		Node n2 = map.get(e2);
		Node re1 = find(n1); // re--> representative element
		Node re2 = find(n2); // re--> representative element

		if (re1.rank == re2.rank) {
			re1.parent = re2;
			re2.rank++;
		}
		if (re1.rank > re2.rank) {
			re2.parent = re1;
		} else {
			re1.parent = re2;
		}
	}

}
