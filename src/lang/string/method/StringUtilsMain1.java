package src.lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java";

        System.out.println(String.valueOf(num));

        // 자바에서는 문자열 + x 는 무조건 문자열
        String numStirng2 = "" + num;
        System.out.println(numStirng2);

        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);
    }
}
