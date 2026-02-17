package QAInterviewPrograms.numberPrograms;

public class FindMinNumber {
	public static int findMinNumber(int[] nums) {
		int minValue=nums[0];
		for(int num:nums) {
			if(num<minValue) {
				minValue=num;
			}
		}
		return minValue;
	}
	public static void main(String[] args) {
		int[] nums= {0,2,4,5,-1,-2,-4,-10,-23};
		System.out.println(findMinNumber(nums));
	}
}
