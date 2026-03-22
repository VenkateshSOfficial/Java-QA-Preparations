package QAInterviewPrograms.programsNew;

import java.util.*;


public class FirstNonRepeatingCharacter {
	public static char execute(String word){
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char ch:word.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		System.out.println(map);
		for(char ch:word.toCharArray()){
			if(map.get(ch)==1){
				return ch;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=s.nextLine();
		System.out.println(execute(word));
	}
}
