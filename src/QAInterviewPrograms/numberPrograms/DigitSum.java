package QAInterviewPrograms.numberPrograms;

public class DigitSum {
	public static void main(String[] args) {
		String val = "abc123dc456";
		int sum = 0;

		// Loop through each character in the string
		for (int i = 0; i < val.length(); i++) {
			char ch = val.charAt(i);
			// Check if the character is a digit
			if (Character.isDigit(ch)) {
				// Convert the character to its integer value and add to sum
				sum += Character.getNumericValue(ch);
			}
		}

		System.out.println("Sum of digits: " + sum);
	}
}
