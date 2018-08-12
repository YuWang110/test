/* 输入一个String数据,输出string中大写字母的个数 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }

}