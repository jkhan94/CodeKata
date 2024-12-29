/*
인원수 / 조각수 = 몫 ... 나머지
나머지=0이면 판수 = 몫 
나머지 != 0 이면 판수 = 몫=1
*/
class Solution {
    public int solution(int slice, int n) {
        int answer = n/slice; 
        
        if (n%slice != 0){
            answer++;
        }        
        
        return answer;
        // return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
