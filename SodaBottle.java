// 汽水瓶
import java.util.Scanner;

public class Main {

    public static int f(int i) {
        if (i == 1)
            return 0;
        else if (i == 2)
            return 1;
        else {
            int a = i / 3;
            int b = i % 3;
            return a + f(a + b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0)
                break;
            else {
                System.out.println(f(n));
                continue;
            }
        }
        in.close();
    }

}