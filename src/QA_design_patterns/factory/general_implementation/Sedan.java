package QA_design_patterns.factory.general_implementation;

public class Sedan implements Car{
	@Override
	public void assemble() {
		System.out.println("Assembling Sedan");
	}
}
