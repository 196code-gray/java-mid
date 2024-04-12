package src.lang.string.builder;
/*
    앞의 LoopStringMain 에 비해 시간이 훨씬 적게 걸렸다.
    why?
        자바는 String 최적화를 지원하지만 for문 안의 string 은
        최적화가 어렵다.
        따라서 for 문 안의 result 의 경우 new StringBuilder().append()
        이런식으로 10만번 추가했을 것.
        그러면 시간이 어마무시하게 걸림.
        하지만 현재 클래서 코드에서는 StringBuilder 를 직접 생성해주고 append 함으로
        for 문 안에서 다시 생성하는 일 없이 추가만 되어서 매우 성능이 빨라짐.

    아래 같은 상황에서 StringBuilder 를 직접 사용하면 좋다.
        - 반복문에서 반복해서 문자를 연결
        - 조건문을 통해 동적으로 문자열을 조합할 때
        - 복잡한 문자열의 특정 부분을 변경해야 할 때
        - 매우 긴 대용량 문자열을 다룰 때
 */
public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++){
            sb.append("Hello, Java ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println(sb.toString());
        System.out.println(endTime - startTime);
    }
}
