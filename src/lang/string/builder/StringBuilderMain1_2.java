package src.lang.string.builder;

// 만드는 사람이 수고로우면 쓰는 사람이 편하고, 만드는 사람이 편하면 쓰는 사람이 수고롭다.
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A").append("B").append("C").append("D")
                .insert(4, "java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println(sb);
    }
}
