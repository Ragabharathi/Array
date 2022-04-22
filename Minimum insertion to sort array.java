Given an array of integer numbers, we need to sort this array in a minimum number of steps where in one step we can insert any array element from its position to any other position. 
Examples : 
 

Input  : arr[] = [2, 3, 5, 1, 4, 7, 6]
Output : 3
We can sort above array in 3 insertion 
steps as shown below,
1 before array value 2
4 before array value 5
6 before array value 7

Input : arr[] = {4, 6, 5, 1}
Output : 2
  
  
  import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int[] list=new int[n];
	for(int i=0;i<n;i++)
	list[i]=1;
	for(int i=1;i<n;i++){
	    for(int j=0;j<i;j++){
	        if(arr[i]>=arr[j] && list[i]<list[j]+1)
	        list[i]=list[j]+1;
	    }
	}
	int max=0;
	for(int i=0;i<n;i++){
	    if(max<list[i])
	    max=list[i];
	}
System.out.println(n-max);
	}
}
