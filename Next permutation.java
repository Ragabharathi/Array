Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]

class Solution {
    public void nextPermutation(int[] nums) {
                  
        if(nums.length==0 || nums.length==1) {
            return;
        }
        
        int n = nums.length; 
        
        int i = n-1;
        while(i>0 && nums[i-1] >= nums[i]) {
            i--;
        }
        
        if(i==0) {
            reverse(nums, 0, n-1);
            return ;
        }
        
        int t = i-1;
        
        
        int min_diff = Integer.MAX_VALUE;
        int min_index = -1;
        
        for(int j=i; j<n; j++) {  
            
            if(nums[j]>nums[t] && min_diff>=nums[j]-nums[t] ) {
                
                min_diff = nums[j]-nums[t];
                min_index = j;
            }
        }
        
        if(min_index==-1) {
            return;
        }
        
        swap(nums,t,min_index);
        reverse(nums, i, n-1);
    }
    
    void swap(int[] nums, int i, int j) {
        
        int k = nums[i];
        nums[i]=nums[j];
        nums[j]=k;
        
    }
    
    void reverse(int[] nums, int i, int j) {
        
        while(i<j) {
            
            swap(nums, i ,j);
            i++;
            j--;
            
        }
    }
}
