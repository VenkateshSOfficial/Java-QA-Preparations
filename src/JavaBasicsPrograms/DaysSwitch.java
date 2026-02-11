package JavaBasicsPrograms;
import java.util.Scanner;


public class DaysSwitch{
	public static void days(int day){
		switch(day){
		case 1,2,3,4,5 -> System.out.println(day + " is a weekay");
		case 6,7 -> System.out.println(day + " is a weekend");
		default -> System.out.println("Invalid input");	
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		int day=s.nextInt();
		days(day);
	}
}