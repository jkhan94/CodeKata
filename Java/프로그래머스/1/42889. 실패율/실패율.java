/*
1. 스테이지에 도달한 플레이어 수 
    지나간 사람도 포함되므로 따로 계산해야 함.
2. 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
    stages에 저장된 값
3. N+1 다 끝낸 사람
4. 실패율 DESC, 스테이지 번호 ASC
    도달한 플레이어 없으면 실패율=0
    
테스트케이스 추가
4 [1,1,1,1,1,1] [1,2,3,4]
*/
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int idx = 0;
        int[] answer = new int[N];
        double[] uncleared = new double[N+2];
        double[] reached = new double[N+2];
        double[] failRatio = new double[N+1];
        double[] sortedFailRatio = new double[N];
        
        for(int i=0; i<stages.length; i++){
            for(int j=1; j<=stages[i]; j++){
                reached[j]++;                
            }            
            uncleared[stages[i]]++;            
        }
        
        for(int i=1; i<=N; i++){
            failRatio[i] = uncleared[i]/reached[i];
            if(Double.isNaN(failRatio[i])){
                failRatio[i]=0.0;
            }
            sortedFailRatio[i-1] = failRatio[i];
            // System.out.println(uncleared[i]+" "+reached[i]+" "+sortedFailRatio[i-1]);
        }
        
        Arrays.sort(sortedFailRatio); // ASC
        
        // for(int i=1; i<=N; i++){
        //     System.out.println(sortedFailRatio[i-1]);
        // }
        
        for(int i=N-1; i>=0; i--){
            for(int j=1; j<=N; j++){
                if(sortedFailRatio[i] == failRatio[j]){
                    answer[idx++] = j;
                    failRatio[j] = -1.0;
                    break;
               }
            }            
        }        
                
        return answer;
    }
}