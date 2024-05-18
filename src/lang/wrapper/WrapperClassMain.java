package src.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        /*
        Integer에 빨간줄이 뜨는 이유는 @Deprecated이 붙어있기 때문.
        현재는 아닌 미래에 없어실 예정이라는 의미로, 삭제될 예정이니 사용하지 말아달라는 의미.
        대신에 valueOf를 사용하라고 말해주고 있음.

        valueOf는 무엇이 다른가?
        -128 ~ 127 자주사용하는 숫자 값 재사용, 불변.
        문자열 pull처럼 미리 만들어 놓은 것을 반환.
         */
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);

        int intValue = integerObj.intValue();
        System.out.println(intValue);

        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + (newInteger.equals(integerObj)));

        /*
        valueOf를 사용했을 때 -128 ~ 127사이의 수는 string pull처럼 미리 만들어 놓은 것을 반환하기 때문에
        integerObj와 integerObj2의 참조값이 같은 것을 확인할 수 있다.
         */
        Integer integerObj2 = Integer.valueOf(10);
        System.out.println("== : " + (integerObj2 == integerObj));

    }
}
