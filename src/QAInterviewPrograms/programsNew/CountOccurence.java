package QAInterviewPrograms.programsNew;

import java.util.*;


public class CountOccurence {
	public static Map<Character, Integer> count(String word){
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:word.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		return map;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=s.nextLine();
		System.out.println(count(word));
	}
}
