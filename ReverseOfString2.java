// 字符逆序 输入：I am a student   输出：tneduts a ma I
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        while(in.hasNextLine()){
            String str = in.nextLine(); 
            String s = "";
            int len = str.length();
            for(int i=len-1;i>=0;i--) {
                s += str.charAt(i);
            }
            System.out.println(s);
        }
                
        in.close();
    }

}