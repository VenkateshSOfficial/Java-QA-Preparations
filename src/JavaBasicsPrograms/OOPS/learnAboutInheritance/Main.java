package JavaBasicsPrograms.OOPS.learnAboutInheritance;

public class Main {
	public static void main(String[] args) {
		Box box=new Box(10);
		Box box2=new Box(10,20,30);

		System.out.println(box.l + " " + box.w + " " + box.h);
		System.out.println(box2.l + " " + box2.w + " " + box2.h);

	}
}
