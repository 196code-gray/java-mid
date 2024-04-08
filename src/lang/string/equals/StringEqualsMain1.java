package src.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        // 이게 가능한 이유는 String 내부에 equals 를 override 해놨기 때문
        System.out.println(str1.equals(str2));

        // 리터널 타입의 경우
        String str3 = "hello";
        String str4 = "hello";

        // 둘 다 왜 true?
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        /*
        동등성도 true인 이유는 자바에서 리터널 타입을 사용시 스트링 풀이라는 곳에 문자열 생성
        클래스 파일 로드시 인스턴스를 만들어 놓고, 프로그램 실행 시에 인스턴스를 가져다 사용
        따라서 같은 인스턴스를 가져 왔기 때문에 동등성이 true 로 나온다.
        아래에서 hashcode 를 보면 3와 4가 같은 것을 확인할 수 있다.
         */
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}
