package QAInterviewPrograms.stringPrograms;

public class OccurancesOfString {
	public static int countOfString(String str){
		String[] toms = str.split("tom",-1);
		int count = toms.length - 1;
		return count;
	}

	public static void main(String[] args) {
		System.out.println("The count of tom in the string is: " + countOfString("tomnvhdtomvnhdtomkfjjtom"));

	}
}
