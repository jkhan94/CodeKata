import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                list.add(numlist[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}