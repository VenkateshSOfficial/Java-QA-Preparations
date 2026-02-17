package JavaBasicsPrograms.learnStaticExample;

public class LearnStaticBlock {
	static int a=10;
	static int b=12;

	static {
		System.out.println("This is static block");
		a=a+5;
		b=b+5;
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}
