/*
소수로 나눈 나머지가 0이 아닐 때까지 나눔
나눠지는 수를 리스트에 저장
*/
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                while(n%i == 0){
                    n/=i;
                }
                answer.add(i);
            }           
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}