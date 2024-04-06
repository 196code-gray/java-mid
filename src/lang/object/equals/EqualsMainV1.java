package src.lang.object.equals;
// 동일성과 동등성
public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        /*
        아래 두 결과는 둘 다 false
        why?
            equals 도 내부동작은 결국 == 비교이기 때문.
            따라서 아래 두 코는 사실 같은 코드이다.
         동등성 비교 필요시 override 로 재정의 후 가능
         */
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));


    }
}
