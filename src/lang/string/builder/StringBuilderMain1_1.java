package src.lang.string.builder;
/*
    String 은 불변이기 때문에 값을 생성할 때마다 new String 으로
    새 객체를 생성해 줘야함.
    ex) A + B + C + D
        new A.concat(B);
        new AB.concat(C);
        new ABC.concat(D);
        ABCD 하나의 결과값 위해 총 3개의 불필요한 인스턴스 생성.
        나중에 GC에 의해 처리 됨.

     따라서 불변이 아닌 가변 String 을 사용하자.
     단 사이드 이팩트에 주의.
     String 의 변경이 잦고, 추가가 자주 일어날 경우 특이 유용.

     변경이 끝나면 불변인 String 으로 변경해서 사이드 이팩트를 막자.
 */
public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(4, "Java");
        System.out.println(sb);

        // 삭제
        sb.delete(4, 8);
        System.out.println(sb);

        // 뒤집기
        sb.reverse();
        System.out.println(sb);

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println(string);
    }
}
