import java.util.*;

public class MergeArray {
   public static void mergeArray(int arr1[],int arr2[],int arr3[],int n,int m){
       int i=0;int k=0;int j=0;
       while(i<n && j<m){
           if(arr1[i]<arr2[j]){
               arr3[k++]=arr1[i++];
           }
           else{
               arr3[k++]=arr2[j++];
           }
       }
       while(i<n){
           arr3[k++]=arr1[i++];
       }
       while(j<m){
           arr3[k++]=arr2[j++];
       }

   }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n+m];
        mergeArray(arr1,arr2,arr3,n,m);
        for(int i=0;i<n+m;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
