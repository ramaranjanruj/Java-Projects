package again;

import java.util.*;

public class checkReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int size = A.length();
        String output = "Yes";
        
        for(int i=0; i<size/2; i++){
            if(A.charAt(i) != A.charAt(size-1-i)){
                output = "No";
                break;
            }
        }
        sc.close();
               
           System.out.println(output);    
        
    }
}
