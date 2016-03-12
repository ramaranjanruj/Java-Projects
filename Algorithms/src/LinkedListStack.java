
public class LinkedListStack {
	public static void main(String[] args){
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.push("Ram");
		linkedlist.push("Ruj");
		linkedlist.push("Yamaha");
		linkedlist.push("Guitar");
		
		System.out.println(linkedlist.pop());
		System.out.println(linkedlist.pop());
		System.out.println(linkedlist.pop());
		System.out.println(linkedlist.pop());
	}
}


class LinkedList{
	
	private class Node{
		String item;
		Node next;
	}
	
	private Node first = null;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(String s){
		Node oldfirst = first;
		first = new Node();
		first.item = s;
		first.next = oldfirst;
	}
	
	public String pop(){
		String output = first.item;
		first = first.next;
		return output;
	}
}