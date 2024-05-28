package src.lang.enum1;

public class WeekExam {
    public static void main(String[] args) {
        System.out.println(Week.MON == Week.SUN);
        System.out.println(Week.MON.equals(Week.SUN));
        System.out.println(Week.MON.hashCode());
        System.out.println(Week.SUN.hashCode());

        Week M = Week.MON;
        System.out.println(M == Week.MON);
        System.out.println(M.hashCode() + " ," + Week.MON.hashCode());
    }
}
