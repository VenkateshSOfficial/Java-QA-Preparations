package JavaBasicsPrograms.learnStaticExample;

public class Main {
	public static void main(String[] args) {
		Human kaushik=new Human("Kaushik",34,200000,true);
		Human venkatesh=new Human("Venkatesh",30,100000,false);

		System.out.println(Human.population);
//		Human venkatesh=new Human("Venkatesh",32,180000,false);
	}
	public void greeting(){
		System.out.println("Hello");
	}
}
