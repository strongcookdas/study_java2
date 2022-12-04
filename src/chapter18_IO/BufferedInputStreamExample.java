package chapter18_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception {
        long start = 0;
        long end = 0;

        FileInputStream fis = new FileInputStream("test.txt");
        start = System.currentTimeMillis();
        while (fis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용하지 않았을 때 " + (end - start) + "ms");
        fis.close();

        FileInputStream fis2 = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while (bis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용했을 때 " + (end - start) + "ms");
        bis.close();
        fis2.close();
    }
}
