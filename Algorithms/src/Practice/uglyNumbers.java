package Practice;

public class uglyNumbers {
	public static void main(String[] args){

		int count = 1;
		int num = 2;
		
		while(count < 200){
			count = count + checkUgly(num);
			num++;
		}
		
		System.out.println("The 150th ugly number is: " + num);
	}
	
	public static int checkUgly(int n){
		while(n%2 == 0) n = n/2;
		while(n%3 == 0) n = n/3;
		while(n%5 == 0) n = n/5;
		
		if(n == 1) return 1;
		else return 0;
	}
}


