package src.lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "   Java Programming";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        /*
       trim = 앞 뒤 스페이스만 지원
       strip = 앞 뒤 다른 것도 지원
         */
        System.out.println("공백 제거 : " + strWithSpaces.trim());
        System.out.println("공백 제거 : " + strWithSpaces.strip());
        System.out.println("아 공백만 제거 : " + strWithSpaces.stripLeading());
    }
}
