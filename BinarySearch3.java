import java.sql.SQLOutput;
import java.util.Scanner;
// find number of duplication number of element from array
public class BinarySearch3 {
    public static int firstIndex(int[] arr,int tar){
        int s=0;
        int e= arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==tar){
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static int secIndex(int[] arr,int tar){
        int s=0;
        int e= arr.length-1;
        int ans2=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==tar){
                ans2=mid;
                s=mid+1;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int firstNum = firstIndex(arr, tar);
       // System.out.println(firstNum);
        int secNum = secIndex(arr, tar);
      //  System.out.println(secNum);
        int res=(secNum - firstNum)+1;
         System.out.println(res);
    }
}
