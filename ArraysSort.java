//给定n个字符串，请对n个字符串按照字典序排列。
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++) {
            s[i] = in.next();
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
        in.close();
    }

}