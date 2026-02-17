package JavaBasicsPrograms.singleton;

public class Singleton {
	private Singleton(){
		System.out.println("This is my private constructor");
	}

	private static Singleton getInstance;

	public static Singleton getInstance(){
		if(getInstance==null){
			getInstance=new Singleton();
		}
		return getInstance;
	}
}
