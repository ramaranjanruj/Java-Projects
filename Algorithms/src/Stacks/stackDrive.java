package Stacks;

public class stackDrive {
	public static void main(String[] args){
		
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		
		// Adding elements to the stack
		int size = 10;
		for(int i=1; i<=size; i++){
			stack.push(i);
		}
		
		System.out.println(stack.pop());
	}
}


class Stack{
	
	private class Node{
		int data;
		Node next = null;
		
		Node(int a){
			data = a;
		}
	}
	
	Node top = null;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(int a){
		Node toAdd = new Node(a);
		toAdd.next = top;
		top = toAdd;
	}
	
	public int pop(){
		int value = top.data;
		top = top.next;
		return value;
	}
}