import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        int maxCount = 0;
        HashMap<Integer,Integer> count = new HashMap<>(); // 개수
                
        for(int a : array){ // 숫자별 개수 세기
            if(count.containsKey(a)){
                temp = count.get(a);
                count.put(a, temp+1);
            } else {
                count.put(a, 1);
            }            
        }
        
        // 값으로 정렬하려면 연산이 필요하다.
        // 맵을 조회하면서 값이 가장 큰 것을 찾으면 키를 저장한다.
        // 최빈값이 2번 나오면 -1을 리턴한다.        
        for(int key : count.keySet()){
            temp = count.get(key);
            
            if(temp > maxCount){
                maxCount = count.get(key);
                answer = key;
            } else if(temp == maxCount){
                answer = -1;
            }
        }
        
        return answer;
    }
}