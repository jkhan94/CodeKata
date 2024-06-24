package programmers;

public class CokeQuestion {
    // 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b
    // 빈 병 보유 수 n개
    // 20 - 18 + 6 = 8
    // 빈병 - 갖다준병수 + 받은빈병수
    // answer += 받은빈병수
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = n - (n / a) * a + (n / a) * b;
        }

        System.out.println(n);
        System.out.println(answer);
    }
}
