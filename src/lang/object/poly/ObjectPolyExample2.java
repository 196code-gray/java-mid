package src.lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog,car,object};

        size(objects);


    }
/*
Object 가 필요한 이유
모든 객체를 담을 수 있는 객체 필요.
따라서 자바에서 Object 를 만들어 모든 객체를 참조할 수 있게 함.
 */
    private static void size(Object[] obj) {
        System.out.println("전달된 객체의수는:" + obj.length);
    }
}
