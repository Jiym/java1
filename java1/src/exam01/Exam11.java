package exam01;

public class Exam11 {
	public static void main(String args[]) {
		int[] nums = new int[10];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 2;
			System.out.println(nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("numsÀÇ ÇÕÀº = " + sum);
	}
}
