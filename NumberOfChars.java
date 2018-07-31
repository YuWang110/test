import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        char a = in.next().toLowerCase().charAt(0);
        int b = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a){
                b++;
                }
            }
            System.out.println(b);

    }

}