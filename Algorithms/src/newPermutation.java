
public class newPermutation {
	public static void main(String[] args){
		
		String a = "Ramaranjan";
		String b = "janRamaran";
		
		Permute permute = new Permute();
		boolean output = permute.check(a, b);
		
		System.out.printf("%s ", output);
		
	}
}


class Permute{
	public boolean check(String a, String b){
		
		if(a.length() != b.length()) return false;
		
		int[] val = new int[256]; // Assumption that the values are ASCII
		
		for(int i=0; i<a.length(); i++){
			int c = (int) a.charAt(i);
			val[c]++;
		}
		
		for(int i=0; i<b.length(); i++){
			int c = (int) b.charAt(i);
			if(--val[c] < 0) return false;
		}
		
		return true;
	}
}

