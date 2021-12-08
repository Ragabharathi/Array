Input: arr[] = {8, 4, 2, 1}
Output: 6

Explanation: Given array has six inversions:
(8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).


Input: arr[] = {3, 1, 2}
Output: 2

Explanation: Given array has two inversions:
(3, 1), (3, 2) 
  
  Algorithm: 
Traverse through the array from start to end
For every element, find the count of elements smaller than the current number up to that index using another loop.
Sum up the count of inversion for every index.
Print the count of inversions.
  
  
#include <stdio.h>
#include <stdlib.h>
int getInvCount(int arr[], int n)
{
    int inv_count = 0;
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            if (arr[i] > arr[j])
                inv_count++;
 
    return inv_count;
}
 

int main()
{
    int n ;
    scanf("%d",&n);
    int arr[n],i;
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    printf(" Number of inversions are %d \n",
           getInvCount(arr, n));
    return 0;
}
