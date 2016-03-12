package Practice;

public class mergeLinkList {
	public static void main(String[] args) {
		Node list1 = new Node(0);
		Node list2 = new Node(0);
		
		int size1 = 3;
		int size2 = 5;
		
		for(int i=1; i<=size1; i++){
			list1.addToList(i);
		}
		
		for(int i=1; i<=size2; i++){
			list2.addToList(i);
		}
		
		list1.printList();
		System.out.println("");
		list2.printList();
		System.out.println("");
		
		MergeList mergelist = new MergeList();
		mergelist.merge(list1, list2);
		
		list1.printList();
		System.out.println("");
		list2.printList();
	}

}


class MergeList{
	
	public void merge(Node a, Node b){
		
		Node first = a;
		Node first_next;
		
		Node second = b;
		Node second_next;
		
		int len_a = a.count();
		int len_b = b.count();
		
		while(len_a > 0 && len_b > 0){
			
			first_next = first.next;
			second_next = second.next;
			
			first.next = second;
			second.next = first_next;
			
			first = first_next;
			second = second_next;
			
			len_a--;
			len_b--;
		}
		
	}
}