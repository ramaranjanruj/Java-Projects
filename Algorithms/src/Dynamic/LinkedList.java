package Dynamic;

public class LinkedList {
	public static void main(String[] args){
		
		Node a = new Node(0);
		Node b = new Node(1);
		
		
		int size = 5;
		
		for(int i=1; i<=size; i++){
			a.addToList(2*i);
			b.addToList(2*i+1);
		}
		
		/*
		Node.printList(a);
		Node.printList(b);
		Node output = Node.MergeLists(a, b);
		Node.printList(output);
		*/
		
		a.ReversePrint(a);
		
	}
}


class Node{
	
	int data;
	Node next = null;
	
	public Node(int s){
		data = s;
	}
	
	// method for adding elements to a linked list
	public void addToList(int n){
		Node current = this;
		Node toAdd = new Node(n);
		while(current.next != null){
			current = current.next;
		}
		current.next = toAdd;
	}
	
	// Method for printing elements of a linked list
	public static void printList(Node n){
		if(n == null) return;
		else{
			while(true){
				System.out.printf("%d ",n.data);
				n = n.next;
				if(n == null)  break;
			}
			System.out.println("");
		}
	}
	
	// Deleting a node from a linked list
	public Node deln(Node a, int n){
		Node current = a;
		if(n == 1) return a.next;
		else{
			while(n>2){
				current = current.next;
				n--;
				}
			current.next = current.next.next;
			return a;
		}
	}
	
	// Method for removing duplicates from a linked list
	public Node remd(Node a){
		Node current = a;
		while(current != null){
			Node checker = current;
			while(checker.next != null){
				if(current.data == checker.next.data) checker.next = checker.next.next;
				else checker = checker.next;
			}
			current = current.next;
		}
		return a;
	}
	
	// Method for returning kth element from last of a linked list using recursion (Space O(1), Time O(n^2))
	public static int retn(Node a, int k){
		if(a == null) return 0;
		int sum =  retn(a.next, k) + 1;
		if(sum == k) System.out.println(a.data);
		return sum;
	}
	
	// Method for returning the kth element from the end iteratively (Space O(1), Time O(n)) 
	public Node reti(Node a, int k){
		Node first = a;
		Node second = a;
		int count = 0;
		while(first != null){
			if(count >= k) second = second.next;
			first = first.next;
			count++;
		}
		second.next = null;
		return second;
	}
	
	
	// Method to merge two sorted linked list
	public static Node MergeLists(Node A, Node B) {

		Node headA = A;
		Node headB = B;
	    Node newlist = new Node(0);
	    
	    Node start = newlist;
	    while(!(headB == null && headA == null)){
	        if(headB == null){
	            newlist.next = headA;
	            headA = headA.next;
	        }
	        else if(headA == null){
	            newlist.next = headB;
	            headB = headB.next;
	        }
	        else if(headA.data <=  headB.data){
	            newlist.next = headA;
	            headA = headA.next;
	        }
	        else{
	            newlist.next = headB;
	            headB = headB.next;
	        }
	        newlist = newlist.next;
	    }
	    return start.next;
	}
	
	
	// Printing a linked list in reverse using recursion
	void ReversePrint(Node head) {
		    if(head == null) return;
		    ReversePrint(head.next);
		    System.out.println(head.data);
		}
	
}