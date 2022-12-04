package chapter18_IO;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
    public static void main(String[] args)throws IOException {
        OutputStream os = System.out;

        for (byte i = 48; i <59; i++) {
            os.write(i);
        }
        os.write(10);

        for (byte i = 97; i <123; i++) {
            os.write(i);
        }
        os.write(10);

        String str = "가나다라마바사아자차카타파하";
        byte[] bytes = str.getBytes();
        os.write(bytes);

        os.flush();
    }
}
