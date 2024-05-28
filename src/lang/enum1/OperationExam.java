package src.lang.enum1;

public class OperationExam {
    public static void main(String[] args) {
        double x = 2.5;
        double y = 5.0;

        Operation plus = Operation.PLUS;

        String name = plus.toString();

        double result = plus.apply(x, y);
        System.out.println(x + name + y + " = " + result); // 7.5

        Operation multi = Operation.MULTI;

        String n = multi.toString();

        double result2 = multi.apply(x, y);
        System.out.println(x + n + y + " = " + result2); // 12.5
    }
}
