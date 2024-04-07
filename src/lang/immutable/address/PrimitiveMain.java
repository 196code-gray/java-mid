package src.lang.immutable.address;
// 기본형 다시 복습
public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형 변수 a와 b는 공유하지 않는다. a에 있는 값 복사하여 대입.
        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

         b = 20;

        System.out.println(b);
    }
}
