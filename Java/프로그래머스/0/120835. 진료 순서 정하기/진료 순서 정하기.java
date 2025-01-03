/*
정렬된 배열의 값과 기존 배열의 값을 비교해서 같으면 정렬된 배열의 인덱스+1을 넣음.
*/
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
