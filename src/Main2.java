
import java.io.*;


public class Main2 {
    public static void main(String[] args) {
        File f   =  new File("D:\\Java\\Package");
        String[] s = f.list();
        System.out.println(s.length);
        for (String x:s){
            System.out.println(x);
        }

    }
}
