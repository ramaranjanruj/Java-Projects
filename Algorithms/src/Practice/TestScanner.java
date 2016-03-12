package Practice;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      double tax = (T+X)*M/100;
      
      int total = (int) Math.round(M + tax);
      
      System.out.println(total);
      
    }
}
