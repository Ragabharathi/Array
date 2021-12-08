Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]

class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int length = nums.length;
        Arrays.sort(nums);
        long rep = 2147473648;  
        List<Integer> ans = new ArrayList<>();
        for (int i = length / 3; i < length; i++) {
            if (nums[i - length / 3] == nums[i] && nums[i] != rep) {     
                ans.add(nums[i]);
                rep = nums[i];
                i += length / 3;
            }
        }
        return ans; 
    }
}
