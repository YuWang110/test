// 求最小公倍数 输入5  7   输出  35
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == b) {
                System.out.println(a);
            } else if (a > b) {
                int i = 1;
                while ((a * i) % b != 0) {
                    i++;
                }
                System.out.println(a * i);
            } else {
                int i = 1;
                while ((b * i) % a != 0) {
                    i++;
                }
                System.out.println(b * i);
            }
        }
        in.close();
    }

}