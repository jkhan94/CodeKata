/*
0 또는 5로 구성 = 0과 5로 구성되지 않음
*/
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        String temp = "";
        
        for(int i=l; i<=r; i++){
            temp = Integer.toString(i);
            
            if(temp.matches("^[05]+$")){
                answer.add(Integer.parseInt(temp));
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}