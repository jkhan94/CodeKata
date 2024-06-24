package programmers;

public class GCDLCM {
    public static void main(String[] args) {
        int m = 5;
        int n = 12;
        int[] answer = new int[2];
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        int r = max % min;

        if (r == 0) {
            answer[0] = min;
        } else {
            while (true) {
                if (r == 0) {
                    answer[0] = min;
                    break;
                }
                max=min;
                min=r;
                r=max % min;

            }
        }

        if (answer[0] != 0) {
            answer[1] = (m * n) / answer[0];
        }
    }
}
