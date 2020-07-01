public boolean split53(int[] nums) {

	return A(0,nums,0,0);

}
private  boolean A( int B, int[] nums,int C, int D) {
	if(B>=nums.length)
		return C==D;
	if(nums[B]%5!=0 & A(B+1, nums, C+nums[B], D))
		return true;
	if(nums[B]%3!=0 && A(B+1, nums, C,D+nums[B]))
return true;
return false;
}

//Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

//split53([1, 1]) → true
//split53([1, 1, 1]) → false
//split53([2, 4, 2]) → true
