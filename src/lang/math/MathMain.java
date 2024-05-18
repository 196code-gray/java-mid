package src.lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-10));

        System.out.println(Math.ceil(2.1)); // 올림
        System.out.println(Math.floor(2.1)); // 내림
        System.out.println(Math.round(2.1));  // 반올림

        System.out.println(Math.sqrt(4));  // 제곱근
        System.out.println(Math.random());  // 0.0 ~ 1.0 사이의 double 값
    }
}
