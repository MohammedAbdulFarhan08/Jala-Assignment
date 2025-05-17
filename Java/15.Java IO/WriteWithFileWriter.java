//6. Write a program to write text to .txt file using FileWriter

import java.io.*;

public class WriteWithFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("filewriter_output.txt");
        fw.write("Writing to file using FileWriter.");
        fw.close();
    }
}
