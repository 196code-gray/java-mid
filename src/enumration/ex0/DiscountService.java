package src.enumration.ex0;

public class DiscountService {
    public int discount(String grade, int price){
        int discount = 0;

        if (grade.equals("BASIC")){
            discount = 10;
        } else if (grade.equals("GOLD")){
            discount = 20;
        } else if (grade.equals("DIAMOND")){
            discount = 30;
        } else System.out.println(grade + " : 할인 x");

        return price * discount / 100;
    }
}
