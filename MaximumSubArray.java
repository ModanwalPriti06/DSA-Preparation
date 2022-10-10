import java.util.Scanner;

public class MaximumSubArray {
    public static int maxSubArray(int[] arr,int n){
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxSubArray(arr,n);
    }
}
