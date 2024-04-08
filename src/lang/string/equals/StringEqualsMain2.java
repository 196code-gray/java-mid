package src.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println(isSame(str3, str4));
    }

    private static boolean isSame(String str1, String str2) {
        /*
        반드시 equals 로 해야하는 이유 : 개발하는 개발자가 다를 수 있음.
        따라서 new 로 생성한 string 이 들어올지, 리터널 string 이 들어올지 이 메서드를
        만드는 입장에서는 알 수 없음.
         */
        return str1.equals(str2);
        // return str1 == str2;
    }
}
