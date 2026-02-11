package JavaBasicsPrograms;

import java.util.Arrays;


public class LearnArrays{
	public static void main(String[] args){
		int[] rollNo={12,23,45,32,56,87};
		System.out.println(Arrays.toString(rollNo));
		System.out.println(rollNo[3]);
		rollNo[0]=100;
		System.out.println(rollNo[0]);
		System.out.println(Arrays.toString(rollNo));

		for(int val : rollNo){
			System.out.print(val + " ");
		}
		System.out.println();

		String[] names={"Venkatesh","kaushik","Babbi","Karthi","Deepu"};
		System.out.println("Size of array is " + names.length);

		for(int i=0;i<names.length-1;i++){
			if(names[i].equalsIgnoreCase("babbi")){
				System.out.println(i);
			}
		}
	}
}