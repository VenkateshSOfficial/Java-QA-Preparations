package JavaBasicsPrograms;

public class LearnConstructorBasics{
	int rollNo;
	String name;
	float marks;

	LearnConstructorBasics(int rollNo,String name,float marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public static void main(String[] args){
		LearnConstructorBasics venkatesh=new LearnConstructorBasics(10,"Venkatesh",90.86f);
		LearnConstructorBasics kaushik=new LearnConstructorBasics(14,"Kaushik",75.86f);
		System.out.println("Roll No: " + venkatesh.rollNo + ", Name: " + venkatesh.name + ", Marks: " + venkatesh.marks);
		System.out.println("Roll No: " + kaushik.rollNo + ", Name: " + kaushik.name + ", Marks: " + kaushik.marks);

	}
}