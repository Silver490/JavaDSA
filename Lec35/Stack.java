package Lec35;

public class Stack {

	protected int [] arr;     // protected modifier is accessible through inheritance same and different package 
	private int top;
	
	//Stack s = new Stack();
	public Stack() { // constructor
		arr= new int [5];
		top=-1;
	}
	
	//Stack s = new Stack(10)
	public Stack(int cap) {
		arr=new int [cap];
		top=-1;
	}
	
	// To check if stack is empty
	public boolean isEmpty() { 
		// if top == -1, then -1==-1, means true, hence return true
		return top == -1;
	}
	
	
	public boolean isFull() { 
		return top == arr.length-1;
	}
	
	
	
	public void push(int item) throws Exception {
		if (isFull()==true) {
			throw new Exception("Stack is full");
		}
		top++;
		arr[top]=item;
	}
	
	
	
	public int pop() throws Exception{
		if (isEmpty()==true) {
			throw new Exception("Stack is full");
		}
		int val=arr[top];
		top--;
		return val;
	}
	
	
	public int peek() throws Exception{
		if (isEmpty()==true) {
			throw new Exception("Stack is full");
		}
		int val=arr[top];
		return val;
	}
	
	
	
	public int size() {
		return top+1;
	}
	
	
	
	public void display() {
		for (int i = 0; i <=top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
