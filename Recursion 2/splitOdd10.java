public boolean splitOdd10(int[] nums) {
  int A=0;
	int B=0;
	int C=0;
return D(nums,A,B,C);
}
private  boolean D(int[]nums, int A, int B, int C) {
	if(A>=nums.length) {
		return ((B%10==0 && C%2!=0)|| (C%10==0 && B%2 !=0));

	}
	int E=nums[A];
	return (D(nums, A+1, B+E, C)||D(nums, A+1, B,C+E));
}

//Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

//splitOdd10([5, 5, 5]) → true
//splitOdd10([5, 5, 6]) → false
//splitOdd10([5, 5, 6, 1]) → true
