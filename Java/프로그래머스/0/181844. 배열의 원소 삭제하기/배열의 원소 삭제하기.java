import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> d = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        
        a.removeAll(d);
        
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}