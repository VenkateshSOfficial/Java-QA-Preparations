package QAInterviewPrograms.programsNew;

import java.util.Scanner;
import java.util.Stack;


public class ReverseStringUsingStack {
	public static String rev(String word){
		Stack<Character> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(char ch:word.toCharArray()){
			stack.push(ch);
		}
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word=s.nextLine();
		System.out.println(rev(word));
	}
}
