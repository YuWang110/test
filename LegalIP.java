/* 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。 现在需要你用程序来判断IP是否合法。 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String[] st = s.split("\\.");
            int i = 0;
            while (i < 4) {
                int n = Integer.parseInt(st[i]);
                if (n < 0 || n > 255) {
                    System.out.println("NO");
                    break;
                } else
                    i++;
            }
            if (i == 4) {
                System.out.println("YES");
            }
        }
        in.close();
    }

}