//编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<Character>();
        String s = in.nextLine();
        int len = s.length();
        for(int i=0;i<len;i++) {
            if(s.charAt(i)>=0 && s.charAt(i)<=127) {
                hs.add(s.charAt(i));
            }
        }
        System.out.println(hs.size());
        
        in.close();
    }

}