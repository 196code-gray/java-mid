package src.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Y");
        Dog dog = new Dog("멍멍이", 2);

        System.out.println(car.toString());
        System.out.println(dog.toString());

        // 객체 참조값 출력
        System.out.println(car);
        System.out.println(dog);

        // 미리 만들어놓은 메서드로 출력
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

        // 실제 참조값이 보고싶은 경우
        String tex = Integer.toHexString(System.identityHashCode(dog));
        System.out.println(tex);
    }
    /*
    toString 을 오버라이드해서 재정의 한다면 더 알기 쉬운 정보를 얻을 수 있음.
     */
}
