//8. Write text to a .txt file using BufferedWriter

import java.io.*;

public class WriteWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedwriter_output.txt"));
        bw.write("Writing to file using BufferedWriter.");
        bw.newLine();
        bw.write("Second line written.");
        bw.close();
    }
}
