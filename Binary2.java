// 输入一个整数，计算整数二进制中1的个数
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        while(in.hasNextInt()) {
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
        }        
        in.close();
    }

}