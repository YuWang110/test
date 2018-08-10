// 按字节截取字符串
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next() + "*";
            int n = in.nextInt();
            int countByte = 0;
            int i = 0;
            while (countByte <= n) {                
                char ch = s.charAt(i);
                if (ch >= 0x4e00 && ch <= 0x9fa5) {
                    countByte += 2;
                } else {
                    countByte++;
                }
                i++;                
            }
            System.out.println(s.substring(0, i - 1));
        }

        in.close();
    }

}