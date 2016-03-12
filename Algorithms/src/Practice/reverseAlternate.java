package Practice;

public class reverseAlternate {
	public static void main(String[] args){
		
		Node a = new Node(0);
		
		int size = 19;
		for(int i=1; i<size; i++){
			a.addToList(i);
		}
		
		a.printList();
		System.out.println("");
		
		reverseAlt reversealt = new reverseAlt();
		reversealt.deln(a, 5);
		
		a.printList();
		
	}
}

class reverseAlt{
	
	public void revalt(Node a){
		
		Node current = a;
		
		while(current != null && current.next != null){
			current = current.next;
			current.next = current.next.next;
			current = current.next;
		}
	}
	
	public void deln(Node a, int n){
		Node current = a;
		if(n > a.count()) return;
		if(n == 1) current = current.next;
		else{
			
			while(n > 1){
				current = current.next;
				n--;
			}
			current.next = current.next.next;
		}
	}
}