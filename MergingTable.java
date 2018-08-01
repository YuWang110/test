import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int key = in.nextInt();
            int value = in.nextInt();
            if(t.containsKey(key)){
                t.put(key, t.get(key)+value);
            }
            else t.put(key, value);
        }
        for(Integer key:t.keySet()){
            System.out.println(key+" "+t.get(key));
        }
        in.close();
    }

}