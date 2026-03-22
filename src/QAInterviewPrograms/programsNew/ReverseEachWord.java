package QAInterviewPrograms.programsNew;

import java.util.Scanner;
import java.util.Stack;


public class ReverseEachWord {
	public static String reverseWords(String sentance){
		Stack<String> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		String[] words = sentance.trim().split("\\s+");
		for(String word:words){
			stack.push(word);
		}
		while(!stack.isEmpty()){
			sb.append(stack.pop()).append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=s.nextLine();
		System.out.println(reverseWords(word));
	}
}
