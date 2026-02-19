package JavaBasicsPrograms.OOPS.learnAboutStatic;

public class LearnStatic {
	private LearnStatic(){
		System.out.println("This is my private constructor");
	}
	static{
		System.out.println("This is my static block");
	}

	public static void main(String[] args) {
		System.out.println("This is my main method");
		LearnStatic ls = new LearnStatic();
	}
}
