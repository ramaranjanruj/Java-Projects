
public class LinkedListCTI {
	public static void main(String[]  args){
		
		Node node = new Node(1);
		
		node.addtolist(2);
		node.addtolist(7);
		node.addtolist(5);
		
		node.printNode();
	}
}

class Node{
	
	int value;
	Node next = null;
	
	public Node(int a){
		value = a;
	}
	
	public void addtolist(int d){
		Node link = new Node(d);
		Node old = this;
		
		while(old.next != null){
			old = old.next;
		}
		old.next = link;
	}
	
	public void printNode(){
		
		Node current = this;
		//boolean loop = true;
		
		while(true){
			System.out.print(current.value);
			
			if(current.next != null){
				current = current.next;
			}
			else break;
		}
	}

}


