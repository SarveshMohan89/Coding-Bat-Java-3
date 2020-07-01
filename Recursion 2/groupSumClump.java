public boolean groupSumClump(int start, int[] nums, int target) {
  if(start>=nums.length)
		return target==0;
	for(int i=start,j=nums[i]; i<nums.length-2 && j==nums[i+1]; i++) {
		nums[start]+=nums[i+1];
		nums[i+1]=0;
	}
	if(groupSumClump(start+1, nums, target-nums[start]))return true;
	if(groupSumClump(start+1, nums, target))
		return true;
	return false;
}

//Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).

//groupSumClump(0, [2, 4, 8], 10) → true
//groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
//groupSumClump(0, [2, 4, 4, 8], 14) → false