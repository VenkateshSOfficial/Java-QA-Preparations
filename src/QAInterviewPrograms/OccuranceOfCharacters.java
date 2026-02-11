package QAInterviewPrograms;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class OccuranceOfCharacters{
	public static Map<Character,Integer> countOccurances(String word){
		Map<Character,Integer> hashMap=new HashMap<>();
		char[] characters=word.toCharArray();
		for(char ch:characters){
			hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
		}
		return hashMap;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter word");
		String word=s.next().toLowerCase();
		System.out.println(countOccurances(word));
	}
}