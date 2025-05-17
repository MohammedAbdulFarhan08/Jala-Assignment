//4. Write text to a .txt file using BufferedOutputStream


import java.io.*;

public class WriteWithBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_output.txt"));
        String data = "Writing using BufferedOutputStream.";
        bos.write(data.getBytes());
        bos.flush();
        bos.close();
    }
}
