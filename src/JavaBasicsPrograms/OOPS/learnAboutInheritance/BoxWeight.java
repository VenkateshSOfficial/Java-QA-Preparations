package JavaBasicsPrograms.OOPS.learnAboutInheritance;

public class BoxWeight extends Box{
	double weight;

	BoxWeight(double l, double w,double h, double weight){
		super(l,w,h); // super keyword is used to call the constructor of the parent class
		this.weight=weight;
	}

	public static void main(String[] args) {
		BoxWeight bw=new BoxWeight(2,3,4,5);
		Box box=new Box(2,3,4);
		System.out.println(bw.l + " " + bw.w + " " + bw.h + " " + bw.weight);
	}
}
