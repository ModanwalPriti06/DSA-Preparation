import java.util.*;
public class AllTripletSumZero {
    public static void tripletSum(int[] arr, int n) {
        boolean find = false;
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
                    System.out.println(x + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;
                    find = true;
                } else if (x + arr[l] + arr[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
            if (find == false) {
                System.out.println("not found");
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        tripletSum(arr,n);
    }
}
