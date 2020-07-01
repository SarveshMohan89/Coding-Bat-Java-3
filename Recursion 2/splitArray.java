public boolean splitArray(int[] nums) {
  int A=0;
	int B=0;
	int C=0;
	return D(nums,A,B,C);
}
private boolean D(int[]nums, int A, int B, int C) {
	if(A>=nums.length)
		return B==C;
	int E=nums[A];
	return(D(nums,A+1, B+E, C)|| D(nums,A+1,B, C+E));
}

//Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)

//splitArray([2, 2]) → true
//splitArray([2, 3]) → false
//splitArray([5, 2, 3]) → true
