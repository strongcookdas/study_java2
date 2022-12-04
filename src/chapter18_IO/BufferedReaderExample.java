package chapter18_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String str = br.readLine();
        System.out.println(str);
    }
}
