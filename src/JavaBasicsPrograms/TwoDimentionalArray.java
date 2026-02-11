package JavaBasicsPrograms;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int[][] arr= {{1,4,5,8},
				{2,3,4},
				{10,19,17,65,45}};
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
