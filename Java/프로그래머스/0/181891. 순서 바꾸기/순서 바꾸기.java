/*
System.arraycopy(Object 복사할 배열, int 복사 시작 인덱스, Object 붙여넣을 배열, int 붙여넣을 인덱스, int 복사 개수)
*/
import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);
        
        return answer;
    }
}