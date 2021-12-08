Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
        int[] maxSubArray = new int[n];
        maxSubArray[0] = nums[0];
        int max = maxSubArray[0];
        
        for(int i = 1; i < n; i++){
            maxSubArray[i] = nums[i] + (maxSubArray[i - 1] > 0 ? maxSubArray[i - 1] : 0);
            max = Math.max(max, maxSubArray[i]);
        }
        
        return max; 
    }
}
