package QAInterviewPrograms.programsNew;

import java.util.Scanner;
import java.util.Stack;


public class ReverseEachCharacter {
	public static String rev(String sentance){
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<sentance.length();i++){
			if(sentance.charAt(i)!=' '){
				stack.push(sentance.charAt(i));
			}else{
				while (!stack.isEmpty()){
					sb.append(stack.pop());
				}
				sb.append(' ');
			}
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
