package LinkedList;

public class deleteDuplicate { 
	public static void main(String[] args){
		
		Node node = new Node(1);
		
		node.addNode(32);
		node.addNode(34);
		node.addNode(9);
		
		node.printNode();
		System.out.println("");
		
		node.delete(9);
		node.printNode();
		
		
	}
}


class Node{
	
	int data;
	Node next =  null;
	
	public Node(int a){
		data = a;
	}
	
	// Method to add a node
	public void addNode(int val){
		Node latest = new Node(val);
		Node current = this;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = latest;
	}
	
	// Method to print elements of linked list
	public void printNode(){	
		Node current = this;
		while(true){
			System.out.print(current.data);
			if(current.next != null){
				current = current.next;
			}
			else break;
		}
	}
	
	// Method of delete duplicate elements
	public void delete(int d){
		Node n = this;
		
		if(n.data == d) n = n.next;
		
		while(n.next != null){
			if(n.next.data == d){
				if(n.next.next == null){
					n.next = null;
					break;
				}
				else n.next = n.next.next;
			}
			n = n.next;
		}
	}
}