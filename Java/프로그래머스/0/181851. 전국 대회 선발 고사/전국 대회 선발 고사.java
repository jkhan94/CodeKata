/*
배열 쓰면 비교 연산해야 함.
맵<등수, 번호> 로 저장한 뒤 정렬해서 리턴
*/
import java.util.PriorityQueue;

import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // rank[i] 기준으로 i 정렬
        // 최소힙이 디폴트. 최대힙은 (i -> rank[i]).reverse() 해주면 됨.
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.comparingInt(i -> rank[i]));
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
}
/*
import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]==true){
                map.put(rank[i], i);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet); // ASC
                
        return map.get(keySet.get(0))*10000 + map.get(keySet.get(1))*100+ map.get(keySet.get(2));
    }
}
*/