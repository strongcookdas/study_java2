package chapter18_IO;

import java.io.InputStream;

public class SystemInExample2 {
    // 콘솔에서 입력한 번호 알아내기
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        byte[] bytes = new byte[100];

        System.out.println("이름: ");
        int nameBytes = is.read(bytes);
        String name = new String(bytes, 0, nameBytes-2);
        System.out.println(name);
    }
}
