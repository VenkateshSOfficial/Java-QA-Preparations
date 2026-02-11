package JavaBasicsPrograms;

import java.util.ArrayList;

public class LearnArrayList {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>(2);
		list.add(100);
		list.add("Venkatesh");
		list.add('c');
		list.add(false);
		System.out.println(list);
	}
}
