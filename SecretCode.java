//输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾
import java.util.Scanner;

public class Main {
    static char upperCase(char i) {
        if(i == 'Z') {
            return 'a';
        }
        else {
            return (char)(i-'A'+'a'+1);
        }
    }
    
    static char lowerCase(char i) {
        if(i>='a'&&i<='c') {
            return '2';
        }
        else if(i>='d'&&i<='f') {
            return '3';
        }
        else if(i>='g'&&i<='i') {
            return '4';
        }
        else if(i>='j'&&i<='l') {
            return '5';
        }
        else if(i>='m'&&i<='o') {
            return '6';
        }
        else if(i>='p'&&i<='s') {
            return '7';
        }
        else if(i>='t'&&i<='v') {
            return '8';
        }
        else {
            return '9';
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        while(in.hasNext()) {
            String s = in.next();
            String s1 = "";
            for(int i=0;i<s.length();i++) {
                char a = s.charAt(i);
                if(a>='A'&&a<='Z') {
                    s1 += upperCase(a);
                }
                else if(a>='a'&&a<='z') {
                    s1 += lowerCase(a);
                }
                else {
                    s1 += a;
                }
            }
            System.out.println(s1);
        }
        in.close();
    }

}