package QA_design_patterns.factory.general_implementation;

public class CarFactory {
	public static String getCar(String carType){
		if(carType ==null){
			System.out.println("Please provide a valid car type");
		}else{
			switch(carType.toLowerCase()){
				case "suv" -> new SUV().assemble();
				case "sedan" -> new Sedan().assemble();
				case "hatchback" -> new Hatchback().assemble();
				default -> throw new IllegalArgumentException("Unknown car type: " + carType);
			}
		}
		return carType;
	}

	public static void main(String[] args) {
		System.out.println("Your car is : " + getCar(null));
	}
}
