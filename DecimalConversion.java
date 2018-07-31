import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        while(in.hasNext()){
            String str = in.next().substring(2);
            int s = 0;
            int n = 0;
            char ch;
            for(int i=0;i<str.length();i++){
                ch = str.charAt(i);
                if(ch>='0'&&ch<='9')
                    n = ch - '0';
                else if(ch>='A'&&ch<='Z')
                    n = ch - 'A' + 10;
                else if(ch>='a'&&ch<='z')
                    n = ch - 'a' + 10;
                s  = s * 16 + n;
            }
            System.out.println(s);
        }
        in.close();
    }

}