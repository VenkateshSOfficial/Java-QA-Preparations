package QAInterviewPrograms;

import java.util.Scanner;



public class ReverseNumber{
	public static Long reverse(long val){
		long ans=0;
		while(val!=0){
			long reminder=val%10;
		    ans=ans*10+reminder;
		    val=val/10;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		long val=s.nextLong();
		System.out.println(reverse(val));
	}
}