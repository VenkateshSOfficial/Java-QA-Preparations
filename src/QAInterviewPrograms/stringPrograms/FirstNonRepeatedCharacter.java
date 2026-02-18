package QAInterviewPrograms.stringPrograms;

import java.util.*;


public class FirstNonRepeatedCharacter {
	public static Character fetchNonRepeatingCharacter(String word){
		Map<Character,Integer> hashMap=new LinkedHashMap<>();
		for(char ch:word.toCharArray()){
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		System.out.println(hashMap);
		for(char ch:word.toCharArray()){
			if(hashMap.get(ch)==1){
				return ch;
			}
		}
		return null;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter word");
		String word=s.next().toLowerCase();
		System.out.println(fetchNonRepeatingCharacter(word));
	}
}
