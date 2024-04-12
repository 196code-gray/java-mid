package src.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // 분리된 문자열 합침
        System.out.println(String.join("-", splitStr));
    }
}
