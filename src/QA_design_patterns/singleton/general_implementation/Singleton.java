package QA_design_patterns.singleton.general_implementation;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("This is my private constructor");
	}

	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		else {
			System.out.println("Instance already exists");
		}
		return instance;
	}

	public void displayMsg(){
		System.out.println("This is a message from the singleton class");
	}
}
