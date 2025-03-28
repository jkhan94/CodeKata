/*
최대 폰켓몬 수만 구하면 된다. 종류를 리턴하진 않는다.
*/
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums){
            set.add(n);
        }

        return Math.min(set.size(), nums.length/2);
    }
}