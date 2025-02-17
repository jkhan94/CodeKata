// 20 - 18 + 6 = 8
// 빈병 - 갖다준병수 + 받은빈병수
// answer += 받은빈병수
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

       while (n >= a) {
            answer += (n / a) * b;
            n = n - (n / a) * a + (n / a) * b;
        }
        return answer;
    }
}