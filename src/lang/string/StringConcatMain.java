package src.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        /*
        String 같은 참조타입은 절대 + 연산이 불가능
        하지만 String 은 너무 자주 사용되어서 자바에서 특별히 사용가능하게 해준 것.
        + 연산만이다.
         */
        String result2 = a + b;

        System.out.println(result1);
        System.out.println(result2);

    }
}
