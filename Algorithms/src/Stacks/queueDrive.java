package Stacks;

public class queueDrive {
	public static void main(String[] args){
		
	}
}


class Queue{
	
	Node first, last = null;
	
	private class Node{
		int data;
		Node next = null;
		
		Node(int a){
			data = a;
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(int a){
		Node oldlast = last;
		Node last = new Node(a);
		if(isEmpty()) first = last;
		else last.next = oldlast;
		
	}
	
	public int dequeue(){
		if(last == null) return 0;
		int val = last.data;
		Node first = front;
		while(first.next.next != null){
			
			first = first.next
		}
		
		last = first;
		first = front;
		
	}
}
