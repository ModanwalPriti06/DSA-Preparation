// Return the index of target key
import java.util.*;
public class BinarySearch1 {
    public static  int searchTarget(int[] arr,int tar){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
       int res= searchTarget(arr,tar);
       System.out.println(res);

    }
}
