package Dynamic;

public class stepsThree {
	public static void main(String[] args){
		
		System.out.println(count(3));
		
	}
	
	public static int count(int a){
		if(a == 0) return 1;
		else if (a < 0) return 0;
		else return count(a-1) + count(a-2) + count(a-3);
	}

}
