import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        long lg = in.nextLong();
        if(lg!=1){
            out:
            for(int i=2;i<=lg;i++){
                while(lg%i==0){
                    System.out.print(i+" ");
                    lg = lg/i;
                    if (lg==1)
                        break out;
                }
            }
        }
        in.close();
    }

}