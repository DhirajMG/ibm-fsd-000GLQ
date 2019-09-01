package comm.example.letter;

import java.util.TreeMap;

public class LetterSequence {
	private String sentence;
	
	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public TreeMap<Character,Integer> computeFrequency(){
		TreeMap<Character,Integer> treeMap = new TreeMap<Character,Integer>();
		boolean flag = false;
		
		for(Integer i=0; i<this.getSentence().length(); i++) {
			flag = false;
			if(Character.isWhitespace(this.getSentence().charAt(i))) {
				continue;
			}
			if(treeMap.containsKey(this.getSentence().charAt(i))) {
				treeMap.put(this.getSentence().charAt(i), treeMap.get(this.getSentence().charAt(i))+1);
				flag = true;
			}
			if(!flag) {
				treeMap.put(this.getSentence().charAt(i), 1);
			}
		}
		return treeMap;
	}
	public void displayLetterFrequency(TreeMap<Character,Integer> treeMap) {
		for(Character character:treeMap.keySet()) {
			System.out.println(character+" :\t"+getStars(treeMap.get(character)));
		}
	}
	public String getStars(Integer n) {
		String string = "";
		for(Integer i=0; i<n; i++) {
			string += "*";
		}
		return string;
	};
}