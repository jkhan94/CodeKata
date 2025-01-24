/* 
Arrays.copyOfRange(배열, 시작 인덱스, 끝 인덱스)
*/
import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // ASC
        return Arrays.copyOfRange(num_list,0,5);
    }
}