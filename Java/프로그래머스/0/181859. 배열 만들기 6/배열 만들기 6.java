
/*
Stack은 벡터를 상속 받아 스택 메소드만 추가됨.
벡터는 멀티스레드 환경에서 thread safe하게 동작하도록 락을 걸어서 메소드 동기화.
즉, synchronized 키워드 때문에 한 번에 한 스레드만 접근 가능.

성능 떨어지니까 ArrayDeque 사용 권장.
*/
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            } else {
                if(stk.get(stk.size()-1) == arr[i]){
                    stk.remove(stk.size()-1);
                } else {
                    stk.add(arr[i]);
                }
            }
        }
        
        if(stk.isEmpty()){
            stk.add(-1);
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}