import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoPointer1 {
    public static int isPairSum(int[] arr,int sum){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                return 1;
            }
            else if(arr[i]+arr[j]<sum){
                i++;
            }
            else{
                j--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum= sc.nextInt();
        System.out.println(isPairSum(arr,sum));
    }
}
