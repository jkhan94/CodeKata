import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순        
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}