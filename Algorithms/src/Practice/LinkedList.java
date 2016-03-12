package Practice;

public class LinkedList {
	public static void main(String[] args){
		
		Node list = new Node(3);
		
		list.addToList(4);
		list.addToList(6);
		list.addToList(7);
		list.addToList(8);
		list.addToList(9);
		list.addToList(10);
		
		list.printList();
		//list.reverse();
		
		System.out.println("");
		list.delMafterN(5, 2);
		list.printList();
	}
}

class Node{
	
	int head;
	Node next = null;
	
	public Node(int d){
		head = d;
	}
	
	public void addToList(int num){
		
		Node toAdd = new Node(num);
		Node current = this;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = toAdd;
	}
	
	public void printList(){
		
		Node current = this;
		while(true){
			System.out.printf("%d ", current.head);
			current = current.next;
			if(current == null) break;
		}
		
	}
	
	public void reverse(){
		Node current = this;
		Node prev = null;
		Node next;

		while(true){
			next = current.next;
			current.next = prev;
			prev = next;
			current = current.next;
			
			if(current == null) break;
		}
	}
	
	public int count(){
		Node current = this;
		int count = 0;
		while(true){
			if(current == null) break;
			current = current.next;
			count++;	
		}
		return count;
	}
	
	public void delMafterN(int m, int n){
		Node current = this;
		
		while(n>1){
			current = current.next;
			n--;
		}
		
		Node before = current;
		current = current.next;
		
		while(m>0){
			current = current.next;
			m--;
		}
		before.next = current;
	}
}