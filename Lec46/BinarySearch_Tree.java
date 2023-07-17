package Lec46;


public class BinarySearch_Tree {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinarySearch_Tree(int [] in) {
		root= CreateTree(in,0,in.length-1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		int mid= (si+ei)/2;
		Node nn= new Node();
		nn.val=in[mid];
		nn.left=CreateTree(in,si,mid-1);
		nn.left=CreateTree(in,mid+1,ei);
		
		return nn;
	}
	
	

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		if (node==null) {
			return Integer.MIN_VALUE;
		}
		int rigth=max(node.right);
		return Math.max(rigth, node.val);
	}
	
	public static void main(String[] args) {
		int [] in= {10,20,30,40,50,60,70,80,90};
		BinarySearch_Tree bst=new BinarySearch_Tree(in);
		bst.Display();
	}
	
}
