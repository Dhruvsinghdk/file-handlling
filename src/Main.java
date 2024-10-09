
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("myworld");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}