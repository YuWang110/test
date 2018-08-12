/**
 * 功能:等差数列 2，5，8，11，14。。。。
 * 输入:正整数N >0
 * 输出:求等差数列前N项和
 * 返回:转换成功返回 0 ,非法输入与异常返回-1
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n >= 1) {
                System.out.println((3 * n * n + n) / 2);
            } else
                System.out.println(-1);
        }
        in.close();
    }

}