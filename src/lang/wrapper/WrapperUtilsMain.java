package src.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10"); // 문자열 또한 지원.
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 변환

        int compareResult = i1.compareTo(20);
        System.out.println(compareResult);

        System.out.println(Integer.sum(10, 20));

    }
}
