//5. Write a program to read text from .txt file using FileReader

import java.io.*;

public class ReadWithFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("example.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
