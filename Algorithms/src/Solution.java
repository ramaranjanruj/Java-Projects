import java.util.*;
import java.math.*;


public class Solution {
	
	double[][] data;
	double[] output;
	double[] h;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int vars = sc.nextInt();
        int obs = sc.nextInt();
        
        
        System.out.println("Number of variables are :" + vars);
        System.out.println("Number of observations are :" + obs);
        
        Solution solution = new Solution();
        solution.enterData(obs, vars+1);
        solution.printData();
    }
    
    public void enterData(int obs, int vars){
    	data = new double[obs][vars];
    	output = new double[obs];
    	
    	Scanner sc = new Scanner(System.in);
        for(int i=0; i<obs; i++){
           data[i][0] = 1;
           for(int j=1; j<vars; j++){
               data[i][j] = sc.nextDouble();
           }
           output[i] = sc.nextDouble();
       }
        sc.close();
    }
    
    public void printData(){
        for(int i=0; i<2; i++){
               for(int j=0; j<data[0].length; j++){
                   System.out.printf("%s ",data[i][j]);
               }
               System.out.println("");
         }
     }
    
    public static double getMean(double[] data){
    	int count = data.length;
    	double sum = 0;
    	for(int i=0; i<count; i++){
    		sum = sum + data[i];
    	}
    	return sum/count;
    }
    
    public static double getsd(double[] data){
    	int count = data.length;
    	double mean = getMean(data);
    	double sqdiff = 0;
    	for(int i=0; i<count; i++){
    		sqdiff = sqdiff + (data[i] - mean)*(data[i] - mean);
    	}
    	return Math.sqrt(sqdiff/count);
    }
    
    public static double calculateH(double[][] x, double[] theta){
    	double output = 0;
    	int size = theta.length;
    	
    }
}

