package src.lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 java 포함? " + str.contains("Java"));
        System.out.println("Java의 처 번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java' 의 인덱스 : " + str.indexOf("Java", 10));
        System.out.println("Java의 마지막 인덱스 : " + str.lastIndexOf("Java"));

    }
}
