
public class FindMax {

	public static void main(String[] args) {
		int[] nums = { -1,13, 55, 3, 2, 3, -56, 7, 8 };

		int maxNum = getMax(nums);
		System.out.println(maxNum);
		for (int i = 0; i <1000000; i++) {
			
		}
	}

	private static int getMax(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}

		return max;
	}

}
