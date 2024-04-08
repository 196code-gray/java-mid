package src.lang.immutable.change;

public class ImmutaleMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 불변 객체 다룰 때는 반드시 리턴 값을 받을 것!
        obj1 = obj1.add(20);

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}
