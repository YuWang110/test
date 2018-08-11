// 求出n以内的自守数的个数；输入 2000   输出 8
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int count = 1;
            for (Integer i = 1; i <= n; i = i + 10) {
                Integer a = i * i;
                int len1 = a.toString().length();
                int len2 = i.toString().length();
                if (a.toString().substring(len1 - len2).equals(i.toString())) {
                    count++;
                }
            }
            for (Integer i = 5; i <= n; i = i + 10) {
                Integer a = i * i;
                int len1 = a.toString().length();
                int len2 = i.toString().length();
                if (a.toString().substring(len1 - len2).equals(i.toString())) {
                    count++;
                }
            }
            for (Integer i = 6; i <= n; i = i + 10) {
                Integer a = i * i;
                int len1 = a.toString().length();
                int len2 = i.toString().length();
                if (a.toString().substring(len1 - len2).equals(i.toString())) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }

}