Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
  
  
  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j=0,k=0;
		int al=nums1.length;
		int bl=nums2.length;
		int a3 [] = new int[al+bl];
		for(i=0;i<al+bl;i++)
			{
				if(j==al)
				{
					a3[i]=nums2[k];
					k++;
				}
				else if(k==bl)
				{
					a3[i]=nums1[j];
					j++;
				}
				else if(nums1[j]>nums2[k])
				{
					a3[i]=nums2[k];
				
					k++;
			
				}
				else if (nums1[j]<=nums2[k])
				{
					a3[i]=nums1[j];
					
					j++;
					
				}
			}
		if((al+bl)%2!=0)
		{
			return (a3[(al+bl)/2]);
		}
		else 
			{
		
			return ((double)(a3[((al+bl)/2)-1]+a3[(al+bl)/2])/2);
        }
}
}
