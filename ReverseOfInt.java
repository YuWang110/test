//输入一个整数，将这个整数以字符串的形式逆序输出，程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
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