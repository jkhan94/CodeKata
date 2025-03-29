import java.util.*;
/* 최대 이익?
사과값 = 가장 낮은 사과값 p * m개
가장 비싼 사과부터 집어넣음. : score 내림차순 정렬 후 앞에서부터 m개 포장
인덱스 상으론 m-1번째 사과값이 p
*/
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if(score.length < m){
            answer = 0;
        } else {
            Integer[] scoreToInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(scoreToInteger, Collections.reverseOrder());
            for(int i=m-1;i<scoreToInteger.length;i+=m){
                answer += m*scoreToInteger[i];
            }
        }    
        
        
        return answer;
    }
}
/*
// score 오름차순 정렬
// 끝에서부터 m번째에 있는 값들로 상자 가격 계산
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
*/