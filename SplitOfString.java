import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.next();
            int n =str.length()%8;
            if(n!=0){
                str += "00000000";
            }
            while(str.length()>=8){
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
            
        }
        in.close();
    }

}