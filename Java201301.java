/* 请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。 */

import java.util.Scanner;

public class Main {

    static int f(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        } else {
            return f(a, b - 1) + f(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(f(n, m));
        }
        in.close();
    }

}