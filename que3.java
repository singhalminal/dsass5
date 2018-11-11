class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {

	Node head, tail;
	
	Queue() {
	
		this.head = null;
		this.tail = null;
	
	}

	void add(int data) {
		Node temp = new Node(data);
		if (this.head == null)
			this.head = temp;
		else
			this.tail.next = temp;
		this.tail = temp;
	}

	int pop() {
		if (this.head != null) {
			int temp = this.head.data;
			this.head = this.head.next;
			return temp;
		} else {
			return -1;
		}
	}

	int peek() {
		if (this.head != null) 
			return this.head.data;
		else
			return -1;
	}
}

class Stack {
	
	private Queue q1;
	private Queue q2;
		
	Stack() {
	
		q1 = new Queue();
		q2 = new Queue();
	
	}

	void add(int data) {

		q1.add(data);
		int temp = 0;
		while ((temp = q2.pop()) != -1) 
			q1.add(temp);
		Queue temp2 = q1;
		q1 = q2;
		q2 = temp2;
	}
	
	int pop() {
		return q2.pop();
	}

	int peek() {
		return q2.peek();
	}
}
class que3 {

	public static void main(String[] args) {
		
		Stack q = new Stack();

		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.pop());	
		System.out.println(q.peek());
		q.pop();
		q.pop();
		System.out.println(q.pop());

	}
}