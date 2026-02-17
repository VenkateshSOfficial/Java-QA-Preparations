package QAInterviewPrograms.stringPrograms;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class VowelsAdvanced{
	public static Map<Character,Integer> vowels(String word){
		Map<Character,Integer> hashMap=new HashMap<>();
		for(char ch:word.toCharArray()){
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				hashMap.put(ch,hashMap.getOrDefault(ch,0) + 1);
			}
			
		}
		return hashMap;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter word");
		String word=s.next().toLowerCase();
		System.out.println(vowels(word));
	}
}