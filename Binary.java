//输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int count = 0;
        while(n!=0) {
            int a = n % 2;
            if(a==1) {
                count++;
            }
            n = n/2;
        }
        System.out.println(count);
        in.close();
    }

}