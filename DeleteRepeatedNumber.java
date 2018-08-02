import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        String str = in.next();     
        int len = str.length();
        for(int i=len-1;i>=0;i--) {
            int a = str.charAt(i)-'0';          
            if(al.contains(a)) continue;
            else al.add(a);
        }
        for(Integer i:al) {
            System.out.print(i);
        }
        
        in.close();
    }

}