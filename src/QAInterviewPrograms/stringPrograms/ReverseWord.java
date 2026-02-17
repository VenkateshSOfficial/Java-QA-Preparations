package QAInterviewPrograms.stringPrograms;

import java.util.Scanner;


public class ReverseWord{
	public static String reverse(String word){
		char[] chars=word.toCharArray();
		int start=0;
		int end=chars.length-1;
		while(start<end){
			char temp=chars[start];
			chars[start]=chars[end];
			chars[end]=temp;
			start++;
			end--;
		}
		return new String(chars);
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word ");
		String word=s.next();
		String reversedWord=reverse(word);
		System.out.println("The reversed word is " + reversedWord);
		if(reversedWord.equalsIgnoreCase(word)){
			System.out.println(reversedWord + " is palindrome");
		}else{
			System.out.println(reversedWord + " not palindrome");
		}
	}
}