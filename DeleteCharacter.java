// 删除字符串中出现次数最少的字符
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            int[] N = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                N[c - 'a']++;
            }
            int min = 20;
            for (int i = 0; i < 26; i++) {
                if (N[i] < min && N[i] != 0)
                    min = N[i];
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (N[c - 'a'] != min)
                    System.out.print(String.valueOf(c));
            }
            System.out.println();
        }
        in.close();
    }

}