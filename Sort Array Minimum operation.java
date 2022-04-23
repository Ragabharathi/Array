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
    int max=0,min=0,res=0;
    for(int i=0;i<n;i++){
        min=0;max=0;
        for(int j=0;j<i;j++){
            if(arr[i]>arr[j])
            max++;
            if(arr[i]<arr[j])
            min++;
        }
        res+=2*Math.min(max,min)+1;
    }
    System.out.println(res);
	}
}

  7
  10 6 2 3 7 1 2
  output 13
  
