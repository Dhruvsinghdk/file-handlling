import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;

public class Main5 {
    public static void main(String[] args) throws Exception {
        FileWriter f = new FileWriter("Hello.txt");
        BufferedWriter b = new BufferedWriter(f);

        b.write("welcome ");
        b.newLine();
        b.write("To my World ");
        b.newLine();
        b.write("76");
        b.newLine();
        char[] ch = {'A', 'B', 'C'};
        b.write(ch);
        b.newLine();
        b.write(77);

        b.flush();
        b.close();
    }
}

