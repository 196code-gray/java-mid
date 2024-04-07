package src.lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 member1 = new MemberV2(address,"회원A");
        MemberV2 member2 = new MemberV2(address,"회원B");

        System.out.println(member1);
        System.out.println(member2);

        member2.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> B address");
        System.out.println(member1);
        System.out.println(member2);
    }
}
