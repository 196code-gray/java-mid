package src.lang.string.method;

public class StringConmparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Heloo, World!";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a' : " + "c".compareTo("a"));
        System.out.println("'str1' compareTo 'str3' : " + str1.compareTo(str3));
        System.out.println("'str1' compareTo 'str2' : " + str1.compareToIgnoreCase(str2));


    }
}
