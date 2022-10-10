import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class ReverseVowel {
    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static String reverseVowel(String str){
        int i=0;
        int j=str.length()-1;
        char[] st=str.toCharArray();
        while (i<j){
            if(!isVowel(st[i])){
                i++;
                continue;
            }
            if(!isVowel(st[j])){
                j--;
                continue;
            }
            char t=st[i];
            st[i]=st[j];
            st[j]=t;
            i++;
            j--;
        }
        String st2=String.copyValueOf(st);
        return st2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseVowel(str));
    }
}
