/*
범위를 활용해 길이를 계산하는 건 복잡함.
각 선분별로 지나가는 점을 카운트, 카운트 횟수가 1 초과면 중복구간이므로 answer++
-100 ~ 100이므로 총 200칸
*/
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] range = new int[200]; // -100 ~ -99 인덱스 0
        
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){
                range[j]++;
            }
        }
        
        for(int i=0; i<range.length; i++){
            if(range[i]>1){
                answer++;
            }
        }        
        
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            // 선분의 시작점, 끝점 정의
            int from = Math.min(line[0], line[1]);
            int to = Math.max(line[0], line[1]);
            
            // 선분의 [from, to) 구간(포함-미포함)을 반복
            for (int i = from; i < to; i++) {
                // map의 i 위치에 대해 값이 존재하면 1을 더하고, 없으면 1로 초기화
                map.merge(i, 1, Integer::sum);
            }
        }

        // map에서 값이 2 이상인 좌표만 세서 반환
        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}
*/