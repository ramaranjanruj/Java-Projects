package Practice;

public class swapkbeginend {
	public static void main(String[] args){
		
		int size = 10;
		LinkedList1 list = new LinkedList1(1);
		
		for(int i=2; i<=size ; i++){
			list.addlist(i);
		}
		
		list.printList();
		System.out.println("");
		list.swapkth(4);
		list.printList();
		
		
	}
}


class LinkedList1{
	
	int data;
	LinkedList1 next = null;
	
	public LinkedList1(int a){
		data = a;
	}
	
	
	// Adds items to a linked list
	public void addlist(int a){
		
		LinkedList1 newnode = new LinkedList1(a);
		LinkedList1 current = this;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = newnode;
	}
	
	/*
	// Print the items in a linked list
	public void printList(){
		LinkedList1 current = this;
		while(true){
			System.out.printf("%s ", current.data);
			if(current.next == null) break;
			current = current.next;
		}
	}
	*/
	
	
	// Returns  the length of the linked list
	public int count(){
		LinkedList1 current = this;
		int count = 0;
		while(true){
			if(current == null) break;
			current = current.next;
			count++;	
		}
		return count;
	}
	
	//  Swaps kth element from the front and back
	public void swapkth(int pos){
		LinkedList1 current = this;
		int length = current.count();
		
		if(pos > length) return;
		if(2*pos - 1 == length) return;
		
		LinkedList1 x = this;
		LinkedList1 x_prev = null;
		
		for(int i=1; i<pos; i++){
			x_prev = x;
			x = x.next;
		}
		
		LinkedList1 y = this;
		LinkedList1 y_prev = null;
		
		for(int i=1; i<length-pos+1; i++){
			y_prev = y;
			y =  y.next;
		}
		
		if(x_prev != null){
			x_prev.next = y;
		}
		
		if(y_prev.next != null){
			y_prev.next = x;
		}
		
		LinkedList1  temp = null;
		temp = x.next;
		x.next = y.next;
		y.next = temp;
	}
}