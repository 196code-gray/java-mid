package src.lang.object;
/*
최상위 클래스는 항상 object
클래스에 상속 받을 클래스가 없으면 묵시적으로 object 클래스를 상속.
 */
public class Parent{
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
