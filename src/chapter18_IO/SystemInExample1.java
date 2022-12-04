package chapter18_IO;

import java.io.InputStream;

public class SystemInExample1 {
    // 콘솔에서 입력한 번호 알아내기
    public static void main(String[] args) throws Exception {
        System.out.println("== 메뉴 ==");
        System.out.println("1 : 글 쓰기");
        System.out.println("2 : 글 삭제하기");
        System.out.println("메뉴를 선택하세요");

        InputStream is = System.in;
        char inputChar = (char) is.read();
        switch (inputChar) {
            case '1':
                System.out.println("글 쓰기를 선택했습니다.");
                break;
            case '2':
                System.out.println("글 삭제를 선택했습니다.");
                break;
        }
    }
}
