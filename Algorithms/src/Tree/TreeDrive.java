package Tree;

public class TreeDrive {
	public static void main(String[] args){
		
		Node node = new Node(0,"Ramaranjan");
		node.addToTree(1, "Ruj");
		node.get(0);
	}
}

class Node{
	
	int key;
	String value;
	Node left, right = null;
	
	Node(int a, String b){
		key = a;
		value = b;
	}
	
	Node root = null;
	
	
	public void addToTree(int number, String name){	
		root = addToTree(root, number, name);
	}
	
	public Node addToTree(Node n, int num, String s){
		if(n == null) return new Node(num, s);
		else if(num < n.key) n.left = addToTree(n.left, num, s);
		else if(num > n.key) n.right = addToTree(n.right, num, s);
		else n.value = s;
		return n;
	}
	
	public String get(int number){
		Node current = root;
		while(current != null){
			if(number > current.key) current = current.right;
			else if(number < current.key) current = current.left;
			else if(number == current.key) return current.value;
		}
		return null;
	}
}
