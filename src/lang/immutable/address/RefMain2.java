package src.lang.immutable.address;

// 참조형 변수 복습
public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println(a);
        System.out.println(b);

        // 불변이므로 b의 값을 변경하려면 인스턴스를 새로 생성
        b = new ImmutableAddress("부산");

        System.out.println(a);
        System.out.println(b);
    }
}
