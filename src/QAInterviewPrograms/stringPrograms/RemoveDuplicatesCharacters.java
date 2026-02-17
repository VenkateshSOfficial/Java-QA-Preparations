package QAInterviewPrograms.stringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesCharacters {
	public static String fetchDuplicates(String word) {
		Set<Character> character=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		
		for(char ch:word.toCharArray()) {
			if(!character.contains(ch)) {
				character.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the word : ");
		String word=s.next();
		System.out.println(fetchDuplicates(word));
	}
}
