package src.lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    /*
    불변 안에서 값을 변경하기 위해 새로운 불변 객체 생성
    이렇게 만들면 객체도 추가 할 수 있으면서 불변도 유지 가능
     */
    public ImmutableObj add(int add){
        return new ImmutableObj(value + add);
    }

    public int getValue() {
        return value;
    }
}
