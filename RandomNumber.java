import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            TreeSet<Integer> t = new TreeSet<Integer>();
            for(int i=0;i<a;i++){
                int b = in.nextInt();
                t.add(b);
            }
            for(Integer i :t){
                System.out.println(i);
            }   
        }
        in.close();
    }

}