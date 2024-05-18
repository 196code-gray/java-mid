package src.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        /*
        AutoboxingMain1처럼 valueOf를 사용하지 않아도 자동으로 변환해주는 기능 -> 오토박싱, 오토언박싱
        다만 개발자가 추가를 안할뿐 컴파일러가 추가를 해줌.
         */
        int value = 7;
        Integer boxedValue = value;

        int unboxedValue = boxedValue;

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
