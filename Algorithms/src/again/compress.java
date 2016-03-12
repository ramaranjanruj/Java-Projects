package again;

import java.util.*;
import java.io.*;

public class compress {
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		String input = "I am so honoured and delighted to be able to show you guys the new 'Taking You Higher'. This mix mark a benchmark in the series as it's the first one in which I asked artists to exclusively contribute tracks for it. I am so happy with all the tracks and I really hope you guys enjoy them. Any support you can offer is very much appreciated. The mix is obviously downloadable for free as usual :)";
		String[] splitted = input.toLowerCase().split("\\s+");
		
		HashMap<String, Integer> getMap = new HashMap<String, Integer>();
		
		// Inputting all values into the Hashmap
		for(int i=0; i<splitted.length; i++){
			if(getMap.containsKey(splitted[i])){
				int count = getMap.get(splitted[i]);
				getMap.put(splitted[i], count + 1);
			}
			else{
				getMap.put(splitted[i], 1);
			}
		}
		
		// Printing all values of a Hashmap
		for(String s: getMap.keySet()){
			System.out.println(s + ": " + getMap.get(s));
		}
	
		sc.close();
	}

}
