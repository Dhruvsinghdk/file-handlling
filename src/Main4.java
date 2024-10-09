
import java.io.*;

public class Main4 {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("Hello.txt");

        f.write("welocme ");
        f.write("To my World ");
        char[] ch = {'A','B','C'};
        f.write(ch);
        f.write(77);

        f.flush();
        f.close();
    }
}
