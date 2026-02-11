package QAInterviewPrograms;


public class FindMaxNumber {
	public static int findMaxvalue(int[] nums) {
		int maxValue=nums[0];
		for(int num:nums) {
			if(num>maxValue) {
				maxValue=num;
			}
		}
		return maxValue;
	}
	public static void main(String[] args) {
		int[] nums= {1,3,8,2,4,12,34,45};
		System.out.println(findMaxvalue(nums));
	}

}
