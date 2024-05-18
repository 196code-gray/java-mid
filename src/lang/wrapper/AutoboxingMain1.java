package src.lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        // 기본형 -> 래퍼형
        Integer boxedValue = Integer.valueOf(value);

        // 래퍼형 -> 기본형
        int unboxedValue = boxedValue.intValue();

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
