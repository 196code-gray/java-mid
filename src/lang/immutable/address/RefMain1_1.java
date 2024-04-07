package src.lang.immutable.address;

// 참조형 변수 복습
public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        // a의 인스턴스 값 복사
        Address b  = a;

        System.out.println(a);
        System.out.println(b);

        // a와 주소공간을 공유하고 있으므로 b의 변경이 a에도 그대로 영향을 끼침.
        b.setValue("부산");

        System.out.println(a);
        System.out.println(b);
    }
}
