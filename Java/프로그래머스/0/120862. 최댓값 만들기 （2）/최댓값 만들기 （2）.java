/*
음수가 2개 이상이면 음수끼리의 곱도 고려해야 함. 음수가 1개면 불필요.
오름차순 정렬해서 오른쪽 2개의 곱과 왼쪽 2개의 곱을 비교해서 큰 값 리턴
*/
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int length = numbers.length;
        Arrays.sort(numbers); // ASC
        
        return Math.max(numbers[0]*numbers[1], numbers[length-1]*numbers[length-2]);
    }
}