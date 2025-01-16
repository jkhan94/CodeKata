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