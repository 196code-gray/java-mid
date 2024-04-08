package src.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        /*
        String 은 앞이 대문자. 즉 클래스라는 의미이다.
        참조형 객체.
        하지만 스트링을 생성할 때 아래와 같이 " " 이렇게 로도 생성이 가능하다.
            why
            String 타입은 너무 많이 사용되기에 자바에서 new String(" ") 이라고 생성해줌.
            따라서 직접 new 를 사용하지 않아도 되는 것.
            우리 눈에 안보일 뿐 자바 내부에서는 new 를 통해 String 을 생성.
         */
        String str1 = "hello";
        String str2= new String("hello");

        System.out.println(str1);
        System.out.println(str2);
    }
}
