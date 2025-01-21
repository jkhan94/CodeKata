/*
최대 서비스 치킨 수는 몫의 합
서비스 치킨 수 : chicken/10
chicken/10 + chicken%10 <10일 때까지 반복
*/
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(true){            
            answer+=chicken/10;   
            chicken = chicken/10 + chicken%10;
            if(chicken < 10){
                break;
            }                      
        }
        
        return answer;
    }
}