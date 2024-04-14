package src.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        /*
        현재 result 가 제대로 된 값을 출력할 수 있는 이유는
        add의 리턴값이 this이기 때문에 가능.
        아래 메서드들이 체인처럼 연결되어 있다고 하여 메서드 체이닝 기법이라고 함.
         */
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println(result);
    }
}
