package src.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString은 Object 에 있는 메서드.
        // object 를 묵시적으로 상속받았으므로 하위 객체에서는 object에 있는 메서드 사용가능
        String string = child.toString();
        System.out.println(string);
    }
    /*
    왜 모든 클래스는 object를 상속받아야 하는가?
        1. 공통 기능
        2. 다형성 기본 구현
     */
}
