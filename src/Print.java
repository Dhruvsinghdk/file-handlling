import java.io.*;

public class Print {
    public static void main(String[] args) throws Exception {
        PrintWriter p = new PrintWriter("Hello.txt");
        p.write(65);
        p.println();
        p.println("hello welcome");
        p.println("77");
        p.println(77.78);

        p.flush();
        p.close();
    }
}
