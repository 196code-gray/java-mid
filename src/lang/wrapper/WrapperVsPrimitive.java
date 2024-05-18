package src.lang.wrapper;

public class WrapperVsPrimitive {
    /*
    결과
    기본형 : 424ms
    래퍼형 : 6219ms

    성능에서 차이가 나는 이유
    기본형의 경우 그 크기만큼의 공간만 차지. int는 4byte.
    래퍼형의 경우 내부에 필드로 가지고 있는 기본형의 값뿐만 아니라 자바에서 객체 자체를 다루는데 필요한 객체 메타데이터를 포함
    그리고 불변객체를 계속 생성하니 시간이 더 걸림.
    래퍼형의 경우 일반적으로 8 ~ 16byte 차지함.

     */
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(endTime - startTime + "ms");

        // wrapper type으로 계산
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println(endTime - startTime + "ms");
    }
}
