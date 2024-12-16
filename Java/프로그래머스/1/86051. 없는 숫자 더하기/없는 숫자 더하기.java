import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        answer = 45 - sum;        
        return answer;
    }
}
/* 참고
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
*/