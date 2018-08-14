// 坐标移动
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] S = str.split(";");
            int x = 0, y = 0;
            for (int i = 0; i < S.length; i++) {
                if (S[i].equals("")) {
                    continue;
                } else {
                    if (S[i].charAt(0) == 'A' && S[i].substring(1).matches("[0-9]+")) {
                        x -= Integer.parseInt(S[i].substring(1));
                    }
                    if (S[i].charAt(0) == 'D' && S[i].substring(1).matches("[0-9]+")) {
                        x += Integer.parseInt(S[i].substring(1));
                    }
                    if (S[i].charAt(0) == 'W' && S[i].substring(1).matches("[0-9]+")) {
                        y += Integer.parseInt(S[i].substring(1));
                    }
                    if (S[i].charAt(0) == 'S' && S[i].substring(1).matches("[0-9]+")) {
                        y -= Integer.parseInt(S[i].substring(1));
                    }
                }
            }
            System.out.println(x + "," + y);
        }
        in.close();
    }

}