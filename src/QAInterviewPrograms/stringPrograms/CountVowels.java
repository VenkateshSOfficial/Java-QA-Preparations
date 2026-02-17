package QAInterviewPrograms.stringPrograms;

import java.util.Scanner;


public class CountVowels{
	int count=0;
	public int countTheVowels(String word){
		for(char ch:word.toCharArray()){
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		CountVowels cv=new CountVowels();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word ");
		String word=s.next();
		System.out.println("Total vowel count is " + cv.countTheVowels(word));
	}
}