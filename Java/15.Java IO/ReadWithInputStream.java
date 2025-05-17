//1. Write a program to read text from .txt file using InputStream

import java.io.*;

public class ReadWithInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("example.txt");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
    }
}
