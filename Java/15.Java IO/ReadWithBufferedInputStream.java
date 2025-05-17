//3. Read text from a .txt file using BufferedInputStream


import java.io.*;

public class ReadWithBufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
        int ch;
        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
        bis.close();
    }
}
