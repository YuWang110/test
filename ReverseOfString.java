//写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String str = in.next(); 
        String s = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--) {
            s += str.charAt(i);
        }
        System.out.println(s);
        
        in.close();
    }

}