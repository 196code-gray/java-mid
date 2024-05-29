package src.enumration.ex0;

public class StringGradeEx0_2 {
    /*
    현재 DiscountService의 문제점은 String 타입이므로 오타, 소문자, 없는 등급을 입력할 수 있음.
    또한 이러한 문제는 컴파일 에러에서 발생하는 것이 아닌 런타임 에러에서 발생됨.

    해결방법
    String 타입이 아닌 지정된 타입이 필요. discount 메서드에는 정확한 등급만 들어와햐 함.
     */
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int vip = discountService.discount("VIP", price);
        System.out.println(vip);

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
