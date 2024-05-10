import java.util.stream.IntStream;

public class HarshadNumber {
    public static void main(String[] args) {
        // 문자 0-9는 아스키코드에선 48-57
        isHarshard(18);
    }

    public static void isHarshard(int x) {
        IntStream a = String.valueOf(x)
                .chars(); // [49, 56]

        IntStream b = String.valueOf(x)
                .chars()
                .map(ch -> ch - '0'); // [49, 56] 인데 -48(문자 0의 아스키값)을 하면 [1. 8]

        int sum = String.valueOf(x)
                .chars()
                .map(ch -> ch - '0')
                .sum();
        System.out.println(sum);
    }
}
