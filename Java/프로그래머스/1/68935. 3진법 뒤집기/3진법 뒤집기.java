/* 45/3 = 15... 0
   15/3 = 5 ... 0
    5/3 = 1 ... 2
    1/3=0...1
    
    125/3=41...2
    41/3=13...2
    13/3=4...1
    4/3=1...1
    1/3=0...1
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] temp = new int[n];
        int count = 0;
        while (n > 0) {
            temp[count] = n % 3;
            n /= 3;
            count++;
        }
        count--;
        for (int i = 0; i <= count; i++) {
            answer += temp[i] * Math.pow(3, count - i);
        }
        
        return answer;
    }

}
/*
// n%3은 숫자이므로 +a를 통해 문자열로 바꿔준다.
// a를 역순 정렬한다.
// public static int parseInt(String s): 문자열(s)를 10진수의 Integer형으로 변환.
// public static int parseInt(String s,int radix): 문자열(s)를 진수(radix)의 Integer형으로 변환.
class Solution {
    public int solution(int n) {
        String a = "";
        
        while(n > 0){           
            a = (n % 3) + a;
            n /= 3;
        }
        
        a = new StringBuilder(a).reverse().toString();
        return Integer.parseInt(a,3);
    }
}
*/