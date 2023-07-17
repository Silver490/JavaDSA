package Lec35;

public class Queue {

	protected int[] arr;
	protected int size;
	protected int front;

	// Stack s = new Stack();
	public Queue() { // constructor
		arr = new int[5];
		front = 0;
		size = 0;
	}

	// Stack s = new Stack(10)
	public Queue(int cap) {
		arr = new int[cap];
		front = 0;
		size = 0;
	}

	// To check if stack is empty
	public boolean isEmpty() {

		return size==0;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}
	
	public void EnQueue(int item) throws Exception {
		if (isFull() == true) {
			throw new Exception("Queue is full");
		}
		int idx=(front+size)%arr.length;
		arr[idx]=item;
		size++;
	}

	public int DeQueue() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Queue is full");
		}
		int val = arr[front];
		front=(front+1)%arr.length;
		size--;
		return val;
	}

	public int GetFront() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Queue is full");
		}
		int val = arr[front];
		return val;
	}

	

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
