// 密码验证合格程序
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            int count = 0;
            if (str.matches(".*[A-Z]+.*"))
                count++;
            if (str.matches(".*[a-z]+.*"))
                count++;
            if (str.matches(".*[0-9]+.*"))
                count++;
            if (str.matches(".*[^a-zA-Z0-9].*"))
                count++;
            if (count < 3) {
                System.out.println("NG");
                continue;
            }
            for (int i = 0; i < str.length() - 5; i++) {
                String substr = str.substring(i, i + 3);
                if (str.substring(i + 3).contains(substr)) {
                    System.out.println("NG");
                    break;
                }
                if (i == str.length() - 6)
                    System.out.println("OK");
            }
        }
        in.close();
    }

}