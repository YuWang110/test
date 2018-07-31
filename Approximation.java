import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        Float f = in.nextFloat();
        String s = f.toString();
        String[] st = s.split("\\.");
        int i = Integer.parseInt(st[0]);
        int j = st[1].charAt(0)-'0';
        if(j>=5)
            i++;
        System.out.println(i);
        in.close();
    }

}