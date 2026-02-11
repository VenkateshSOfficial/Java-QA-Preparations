package JavaBasicsPrograms;

import java.util.Scanner;

public class LearnSwitchCase{
	public static void friutCall(String fruit){
		switch(fruit.toLowerCase()){
		case "mango" -> System.out.println(fruit + " is tasty and juicy");
		case "apple" -> System.out.println(fruit + " is healthy and keeps doctor away");
		default      ->System.out.println(fruit + " is invalid");
		/*case "mango":
			System.out.println(fruit + " is so juicy");
			break;
		case "apple":
		    System.out.println(fruit + " is red and tasty");
		    break;
		default:
	    	System.out.println("invalid");    	*/
		}
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter fruit name");
		String fruit=s.next();
		friutCall(fruit);
	}
}