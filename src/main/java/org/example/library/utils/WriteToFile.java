package org.example.library.utils;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void write(String filename, String content)  throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filename);
        byte[] contentInBytes = content.getBytes();
        outputStream.write(contentInBytes);
        outputStream.close();
    }
}
