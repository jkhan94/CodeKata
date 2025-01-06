/*
1. 일일이 비교
2. 정렬 후 인원수 계산
*/
import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            if(array[i]>height){
                answer = array.length  - i;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}