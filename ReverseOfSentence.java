//将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String str = in.nextLine(); 
        String[] s = str.split(" ");
        int len = s.length;
        for(int i=len-1;i>=0;i--) {
            System.out.print(s[i]+" ");
        }
                
        in.close();
    }

}