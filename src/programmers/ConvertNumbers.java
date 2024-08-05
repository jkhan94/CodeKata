package programmers;
/*i에 대해서 순차적으로 도는데 i+n, i*2, i*3에 해당하는 숫자가 아닌 모든 i의 dp[i] = -1.
x=10이면
i+n = 15
i*2 = 20
i*3 = 30

15가 되면 아래 연산 실행해서 인덱스가 30, 45, 20인 dp에 연산결과 저장.
*/
public class ConvertNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 40;
        int n = 5;
        int[] dp = new int[y + 100];

        // x~y까지 검색하는데
        for (int i = x; i < y + 1; i++) {
            // x가 아닌 수에 대하여 dp가 0이면 표현불가 수
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            System.out.print(i + " " + dp[i] + " ");

            // x*2가 0이면 *2 했으니까 횟수+1
            // 처음 실행 시 뭘 하든 +1
            // 2번째부터는 첫번째 값과 연산된 횟수 중 작은 값.
            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            System.out.print(dp[i * 2] + " ");

            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
            System.out.print(dp[i * 3] + " ");

            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
            System.out.println(dp[i + n]);
        }
        System.out.println(dp[y]);
    }
}
