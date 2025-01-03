// 우선순위 큐를 사용해 데이터를 입력하면서 내림차순 정렬
// 큐에서 하나씩 꺼내면서 기존 배열과 값 비교.
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] answer = new int[emergency.length];
        int rank = 1;
                
        for(int e : emergency){
            pq.offer(e); // 내림차순 정렬
        }       
        
        while(!pq.isEmpty()){
            int temp = pq.poll();
            for(int i=0; i<emergency.length; i++){
                if(temp == emergency[i]){
                    answer[i] = rank;
                    rank++;
                    break;
                }
            }
        }           
        
        return answer;
    }
}

/*
// 정렬된 배열의 값과 기존 배열의 값을 비교해서 같으면 정렬된 배열의 인덱스+1을 넣음.
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedEmergency = new int[emergency.length];            
        int[] answer = new int[emergency.length];
                
        for(int i=0; i<emergency.length; i++){
            sortedEmergency[i] = emergency[i];
        }
        Arrays.sort(sortedEmergency); // 오름차순 정렬
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<sortedEmergency.length; j++){
                if(emergency[i] == sortedEmergency[j]){
                    answer[i] = sortedEmergency.length - j;
                    break;
                }
            }
        }       
        
        return answer;
    }
}
*/
