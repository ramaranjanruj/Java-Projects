
public HashMap<Integer, Student> getMap(Student[] students){
	HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	for(Student s:students){
		map.put(s.getId(), s);
	}
	return map;
}

// Array List

public ArrayList<String> dynamicarray(String[] words, String[] more){
	ArrayList<String> sentence = new ArrayList<String>();
	
	for(String w: words){
		senetence.add(w);
	}
	
	for(String w:more){
		sentence.add(w);
	}
	
	return sentence;
}



// String Buffer

public String joinwords(String[] words){
	StringBuffer out = new StringBuffer();
	for(word w:words){
		out.append(w);
	}
	return out.toString();
}


// Check duplicity of the string
public boolean checkDuplicate(String[] word){
	duplicate = false;
	if(word.length() > 256){
		duplicate = true;
	}
	
	boolean[] booArray = new boolean[256];
	for(int i = 0; i < word.length(); i++){
		int val = word.charAt(i);
		if(booArray[val]){
			duplicate = true;
			break;
		}
		booArray[val] = true;
	}
	return duplicate;
}

















