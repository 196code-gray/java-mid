package src.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        long currentNano = System.nanoTime();
        System.out.println(currentNano);

        // 환경 변수 읽음(운영체제가)
        System.out.println(System.getenv());

        // 시스템 속성을 읽음(자바가 사용)
        System.out.println(System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] original = {'h', 'e', 'l', 'l', 'o'};
        char[] copied = new char[5];
        System.arraycopy(original, 0, copied, 0, original.length);

        System.out.println(copied);
        System.out.println(Arrays.toString(copied));

        // 프로그램 종료(가급적이면 권장 x)
        System.exit(0);
    }
}
