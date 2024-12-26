/* 유클리드 호제법

max%min=r 일 때, r=0이면 min이 GCD로 반환되어야 함.
12%5=2
5%2=1
2%1=0  -> GCD=1
즉, 1회 계산 후 나머지가 0이 아니면
max = min
min = r 
r=max%min 으로 세팅해야 함.

a%b=r
b%r=r'
...
r'%r=이면 r이 GCD

LCM = a*b/GCD
*/
class Solution {
    public int[] solution(int n, int m) {
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
        
        return answer;
    }
}
/* 재귀함수
import java.util.Arrays;

class TryHelloWorld {
      public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        
        return answer;

    }

   public static int gcd(int p, int q) {
    if (q == 0) return p;
    return gcd(q, p%q);
   }

유클리드 호제법
https://ko.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
*/