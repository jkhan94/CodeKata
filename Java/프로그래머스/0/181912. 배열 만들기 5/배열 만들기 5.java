import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        int temp = 0;
        
        for(String i : intStrs){
            temp = Integer.parseInt(i.substring(s,s+l));
            if(temp > k){
                answer.add(temp);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}