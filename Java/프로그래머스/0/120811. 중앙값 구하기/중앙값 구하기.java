import java.util.*;
class Solution {
    public int solution(int[] array) {       
        Arrays.sort(array); // 오름차순 정렬        
        return array[array.length/2];
    }
}