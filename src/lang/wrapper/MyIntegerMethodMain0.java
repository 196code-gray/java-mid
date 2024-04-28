package src.lang.wrapper;
// 기본형의 한계
public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

    }
    public static int compareTo(int value, int target){
        if (value < target) return -1;

        else if (value > target) return 1;

        else return 0;
    }
    /*
    현재 value 값을 compareTo 메서드를 통해 target 과 비교하는 단순한 작업.
    int 형이 기본형이므로 외부 메서드를 통해서 밖에 비교가 불가능.
    인스턴스를 추가한다던지, 객체 안에 메서드를 추가해서 활용하는 게 불가능.
     */
}
