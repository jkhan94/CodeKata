// return Arrays.stream(numbers).average().orElse(0);
// 매개변수로 정수 배열을 전달받아 평군을 구하는데 만약 null 값이면 0을 반환.
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum =0;
        for(int items: numbers){
            sum += items;
        }
        answer = sum*1.0 / numbers.length;
        return answer;
    }
}