
public class LinkedListQueue {
	public static void main(String[] args){
		
		LinkedLister linkedlist = new LinkedLister();
		
		linkedlist.enqueue("What");
		linkedlist.enqueue("are");
		linkedlist.enqueue("you");
		linkedlist.enqueue("up");
		linkedlist.enqueue("to");
		
		System.out.println(linkedlist.dequeue());
		System.out.println(linkedlist.dequeue());
		System.out.println(linkedlist.dequeue());
		System.out.println(linkedlist.dequeue());
		System.out.println(linkedlist.dequeue());
		
	}
}

class LinkedLister{
	
	private class Node{
		String item;
		Node next;
	}
	
	private Node first, last;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(String s){
		Node oldlast = last;
		last = new Node();
		last.item = s;
		last.next = null;
		if(isEmpty()) first = last;
		else oldlast.next = last;
	}
	
	public String dequeue(){
		String output = first.item;
		first = first.next;
		if(isEmpty()) last = null;
		return output;
	}
}