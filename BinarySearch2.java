//find first and last index number of duplication element
import java.util.Scanner;

public class BinarySearch2 {
    //max first Index of Duplication array
    public static int maxFirstIndex (int[] arr,int dbKey){
        int start=0;
        int end= arr.length-1;
        int ans1=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==dbKey){
                ans1=mid;
                end=mid-1;
            }
            else if(arr[mid]<dbKey){
                start=mid+1;
            }
            else{
                end=mid-1;

            }
        }
        return ans1;
    }
    //max last Index of Duplication array
    public static int maxLastIndex (int[] arr,int dbKey){
        int start=0;
        int end= arr.length-1;
        int ans2=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==dbKey){
                ans2=mid;
               start=mid+1;

            }
            else if(arr[mid]<dbKey){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int dbKey=sc.nextInt();
       int firstIndex= maxFirstIndex(arr,dbKey);
       int lastIndex=maxLastIndex(arr,dbKey);
        System.out.println("First Index num of duplication element "+dbKey+" is : "+firstIndex);
        System.out.println("Last Index num of duplication element "+dbKey+" is : "+lastIndex);
    }
}
