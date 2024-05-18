package src.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMataMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // class 조회(3가지 방법)
        Class clazz = String.class;
        Class clazz1 = new String().getClass();
        Class clazz2 = Class.forName("java.lang.String");

        // 모든 필드 출력가능
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println("field = " + field.getType() + " " + field.getName());

        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("metod = " + method);
        }

        // 현재 클래스의 상위 클래스 정보 출력
        System.out.println("Superclass = " + clazz.getSuperclass());

        // 현재 클래스의 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
