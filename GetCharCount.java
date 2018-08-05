// 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String s = in.nextLine();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                if(ch>='a'&&ch<='z') {
                    count1++;
                }
                if(ch>='A'&&ch<='Z') {
                    count1++;
                }
                if(ch==' ') {
                    count2++;
                }
                if(ch>='0'&&ch<='9') {
                    count3++;
                }
            }
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            System.out.println(s.length()-count1-count2-count3);
        }
        in.close();
    }

}