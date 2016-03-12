package LinkedList;

public class threeSteps {
	public static void main(String[] args){
		
		CountSteps countsteps = new CountSteps();
		int[] map = new int[256];
		System.out.println(countsteps.stepCounter(36, map));
		
	}
}


class CountSteps{
	
	public int stepCounter(int in, int[] map){
		if(in < 0) return 0;
		else if (in == 0) return 1;
		else if(map[in] != 0) return map[in];
		
		else {
			map[in] = stepCounter(in-1, map) + stepCounter(in-2, map) + stepCounter(in-3, map);
			return map[in];
		}
		
	}
}